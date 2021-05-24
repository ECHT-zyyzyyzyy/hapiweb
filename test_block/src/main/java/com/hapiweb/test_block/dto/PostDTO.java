package com.hapiweb.test_block.dto;

import com.hapiweb.test_block.entity.Post;
import lombok.Data;

@Data
public class PostDTO {

    private Post post;
    String token;

}
