package com.hapiweb.test_block.entity;

import lombok.Data;

public class User {
    private String genkey;

    private String username;

    private String password;

    private Integer phone;

    private String email;

    private Integer qq;

    public User(String genkey, String username, String password, Integer phone, String email, Integer qq) {
        this.genkey = genkey;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
    }

    public User() {
        super();
    }

    public String getGenkey() {
        return genkey;
    }

    public void setGenkey(String genkey) {
        this.genkey = genkey == null ? null : genkey.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }
}