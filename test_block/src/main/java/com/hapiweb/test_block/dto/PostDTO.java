package com.hapiweb.test_block.dto;

import com.hapiweb.test_block.entity.Post;
import com.hapiweb.test_block.entity.Reply;
import lombok.Data;

import java.util.List;

@Data
public class PostDTO {

    private Post post;
    private List<Reply> replies;
    private String token;

}
