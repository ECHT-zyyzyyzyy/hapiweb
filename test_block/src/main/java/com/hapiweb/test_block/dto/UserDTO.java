package com.hapiweb.test_block.dto;


import com.hapiweb.test_block.entity.User;
import lombok.Data;

@Data
public class UserDTO {

    private User user;

    private Integer code;
    private String message;

    private String refToken;
    private String accToken;

}
