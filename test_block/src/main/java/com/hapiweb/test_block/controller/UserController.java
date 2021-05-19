package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.UserDTO;
import com.hapiweb.test_block.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public Object register(UserDTO userIn){

        UserDTO userOut = userService.register(userIn);
        //userOut = userService.signin(userOut);
        return userOut;

    }

    @PostMapping("/signinByUsername")
    @ResponseBody
    public Object signin(UserDTO userIn){

        UserDTO userOut = userService.signinByUsername(userIn);
        return userOut;

    }

    @PostMapping("/signout")
    @ResponseBody
    public Object signout(UserDTO userIn){

        UserDTO userOut = userService.signout(userIn);
        return userOut;

    }

}
