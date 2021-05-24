package com.hapiweb.test_block.dto;

import com.hapiweb.test_block.entity.Post;
import lombok.Data;

import java.util.List;

@Data
public class PostListDTO {

    private List<Post> posts;
    private String token;

}
