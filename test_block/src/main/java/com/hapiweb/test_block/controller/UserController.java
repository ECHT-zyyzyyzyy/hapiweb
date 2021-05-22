package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.UserDTO;
import com.hapiweb.test_block.model.Status;
import com.hapiweb.test_block.service.TokenService;
import com.hapiweb.test_block.service.UserService;
import com.hapiweb.test_block.utils.RedisUtilsSO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisUtilsSO redisUtilsSO;

    @Autowired
    TokenService tokenService;

    @PostMapping("/register")
    @ResponseBody
    public Object register(@RequestBody UserDTO userIn){

        UserDTO userOut = userService.register(userIn);
        //userOut = userService.signin(userOut);
        return userOut;

    }

    @PostMapping("/signinByUsername")
    @ResponseBody
    public Object signin(HttpServletRequest request, @RequestBody UserDTO userIn){

        HttpSession session = request.getSession();
        String id = session.getId();
        UserDTO userOut = userService.signinByUsername(userIn);
        String rCode = userOut.getToken();
        userOut.setToken(tokenService.createToken(id, userOut.getToken(), userOut.getUser()));
        if(userOut.getCode()==700){
            redisUtilsSO.set(userOut.getUser().getGenkey(),id + "." + rCode , 604800L);
        }
        return userOut;

    }

    @PostMapping("/signout")
    @ResponseBody
    public Object signout(@RequestBody UserDTO userIn){

        redisUtilsSO.del(userIn.getToken());
        UserDTO userOut = new UserDTO();
        userOut.setCode(Status.SIGNOUT_SUCCESS.getCode());
        userOut.setMessage(Status.SIGNOUT_SUCCESS.getDisc());
        return userOut;

    }

}
