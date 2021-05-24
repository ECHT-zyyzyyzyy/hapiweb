package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;

public interface PostService {

    public PostListDTO list();

    public PostListDTO queryForList(String key);

    public PostDTO getPostById(String id);

    public PostDTO editPost(PostDTO postDTO);

}