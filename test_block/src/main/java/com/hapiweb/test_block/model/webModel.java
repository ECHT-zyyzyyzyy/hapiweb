package com.hapiweb.test_block.model;

public class webModel {

    private String name;
    private Integer code;
    private Object contect;

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

    public Object getContect() {
        return contect;
    }

    public void setContect(Object contect) {
        this.contect = contect;
    }

    public webModel(String name, Integer code, Object contect) {
        this.name = name;
        this.code = code;
        this.contect = contect;
    }
}
