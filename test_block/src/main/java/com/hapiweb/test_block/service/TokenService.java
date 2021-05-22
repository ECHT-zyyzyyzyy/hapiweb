package com.hapiweb.test_block.service;

import com.hapiweb.test_block.entity.User;

public interface TokenService {

    public String createToken(String sessionId, String rCode, User user);

}
