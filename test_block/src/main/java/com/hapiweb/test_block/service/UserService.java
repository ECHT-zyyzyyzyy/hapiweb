package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.UserDTO;
import com.hapiweb.test_block.entity.User;

public interface UserService {

    public UserDTO register(UserDTO userDTO);

    public UserDTO signinByUsername(UserDTO userDTO);

    public UserDTO signout(UserDTO userDTO);

    public User findUserByUsername(String username);

}
