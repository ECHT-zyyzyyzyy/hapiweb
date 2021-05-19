package com.hapiweb.test_block.model;

public enum Status {
    SUCCESS("SUCCESS", 200, "Success"),
    NOTFOUND("PAGE_NOT_FOUND", 404, "The uri does not exist"),
    INTERNAL("SERVER_INTERNAL_PROBLEM", 405, "There are some unexpected problem happens during the processing"),

    CANT_BE_EMPTY("CANT_BE_EMPTY", 600, "Username Or Password must not bu empty"),

    SIGNIN_SUCCESS("SIGNIN_SUCCESS", 700, "Signin successfuly"),
    USER_OR_PW_ERR("USER_DOES_NOT_EXIST_OR_PASSWORD_INCORRECT", 701, "User does not exist or password wrong"),

    REGISTER_SUCCESS("REGISTER_SUCCESS", 800, "Successfully Registed"),
    USER_ALREADY_EXISTS("USER_ALREADY_EXISTS", 801, "The username has bean cattaloged by anothoer person"),


    ;



    private String name;
    private Integer code;
    private String disc;

    Status(String name, Integer code, String disc) {
        this.name = name;
        this.code = code;
        this.disc = disc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }
}
