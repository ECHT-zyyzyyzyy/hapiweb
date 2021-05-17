package com.hapiweb.test_block.entity;

public class Block {
    private String genkey;

    private String name;

    private String disc;

    public Block(String genkey, String name, String disc) {
        this.genkey = genkey;
        this.name = name;
        this.disc = disc;
    }

    public Block() {
        super();
    }

    public String getGenkey() {
        return genkey;
    }

    public void setGenkey(String genkey) {
        this.genkey = genkey == null ? null : genkey.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc == null ? null : disc.trim();
    }
}