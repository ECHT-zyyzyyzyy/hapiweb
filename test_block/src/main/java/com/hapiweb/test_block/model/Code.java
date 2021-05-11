package com.hapiweb.test_block.model;

public enum Code {
    SUCCESS("SUCCESS", 200, "Success"),
    NOTFOUND("PAGE_NOT_FOUND", 404, "The uri does not exist"),
    INTERNAL("SERVER_INTERNAL_PROBLEM", 405, "There are some unexpected problem happens during the processing");

    private String name;
    private Integer code;
    private String disc;

    Code(String name, Integer code, String disc) {
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
