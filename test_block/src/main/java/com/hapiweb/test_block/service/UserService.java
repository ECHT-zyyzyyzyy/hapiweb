package com.hapiweb.test_block.service;

import com.hapiweb.test_block.entity.User;

public interface UserService {

    public User register(User user);

    public User signin(User user);

    public User signout(User user);

}
