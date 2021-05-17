package com.hapiweb.test_block.entity;

public class Reply {
    private String genkey;

    private String postGk;

    private Integer level;

    private String authorGk;

    private String replyToGk;

    private String comment;

    public Reply(String genkey, String postGk, Integer level, String authorGk, String replyToGk) {
        this.genkey = genkey;
        this.postGk = postGk;
        this.level = level;
        this.authorGk = authorGk;
        this.replyToGk = replyToGk;
    }

    public Reply(String genkey, String postGk, Integer level, String authorGk, String replyToGk, String comment) {
        this.genkey = genkey;
        this.postGk = postGk;
        this.level = level;
        this.authorGk = authorGk;
        this.replyToGk = replyToGk;
        this.comment = comment;
    }

    public Reply() {
        super();
    }

    public String getGenkey() {
        return genkey;
    }

    public void setGenkey(String genkey) {
        this.genkey = genkey == null ? null : genkey.trim();
    }

    public String getPostGk() {
        return postGk;
    }

    public void setPostGk(String postGk) {
        this.postGk = postGk == null ? null : postGk.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAuthorGk() {
        return authorGk;
    }

    public void setAuthorGk(String authorGk) {
        this.authorGk = authorGk == null ? null : authorGk.trim();
    }

    public String getReplyToGk() {
        return replyToGk;
    }

    public void setReplyToGk(String replyToGk) {
        this.replyToGk = replyToGk == null ? null : replyToGk.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}