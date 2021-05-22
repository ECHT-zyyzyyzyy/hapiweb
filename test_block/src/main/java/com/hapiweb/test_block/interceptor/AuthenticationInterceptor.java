package com.hapiweb.test_block.interceptor;

import com.auth0.jwt.JWT;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.hapiweb.test_block.JWT.PassToken;
import com.hapiweb.test_block.JWT.UserLoginToken;
import com.hapiweb.test_block.utils.RedisUtilsSO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Set;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    RedisUtilsSO redisUtilsSO;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token，请重新登录");
                }
                // 获取 token 中的 user id
                String userId;
                String rCode;
                try {
                    userId = JWT.decode(token).getClaim("userId").asString();
                    rCode = JWT.decode(token).getClaim("rCode").asString();
                } catch (JWTDecodeException j) {
                    throw new RuntimeException("401");
                }
                String userInfo = (String) redisUtilsSO.get(userId);
                if (userInfo == null) {
                    throw new RuntimeException("会话已过期，请重新登录");
                }
                // 验证 token
                String id = httpServletRequest.getSession().getId();
                if(!(id + "." + rCode).equals(userInfo))
                    throw new RuntimeException("401");
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}