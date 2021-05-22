package com.hapiweb.test_block.service.ServiceImpl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hapiweb.test_block.entity.User;
import com.hapiweb.test_block.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class TokenServiceImpl implements TokenService {

    @Value("secret")
    private String SECRET;

    @Override
    public String createToken(String sessionId, String rCode, User user) {

        HashMap<String, Object> headerMap = new HashMap<>();
        headerMap.put("typ", "jwt");
        headerMap.put("alg", "hs256");

        HashMap<String, Object> claimMap = new HashMap<>();
        claimMap.put("userId", user.getGenkey());
        claimMap.put("rCode", rCode);

        String token = "";
        token = JWT.create().withHeader(headerMap).withPayload(claimMap).sign(Algorithm.HMAC256(SECRET));
        return token;
    }

}
