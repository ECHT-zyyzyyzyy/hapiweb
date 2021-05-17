package com.hapiweb.test_block.entity;

public class Post {
    private String genkey;

    private String title;

    private String blockGk;

    private String authorGk;

    public Post(String genkey, String title, String blockGk, String authorGk) {
        this.genkey = genkey;
        this.title = title;
        this.blockGk = blockGk;
        this.authorGk = authorGk;
    }

    public Post() {
        super();
    }

    public String getGenkey() {
        return genkey;
    }

    public void setGenkey(String genkey) {
        this.genkey = genkey == null ? null : genkey.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBlockGk() {
        return blockGk;
    }

    public void setBlockGk(String blockGk) {
        this.blockGk = blockGk == null ? null : blockGk.trim();
    }

    public String getAuthorGk() {
        return authorGk;
    }

    public void setAuthorGk(String authorGk) {
        this.authorGk = authorGk == null ? null : authorGk.trim();
    }
}