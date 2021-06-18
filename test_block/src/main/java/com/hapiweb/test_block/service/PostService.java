package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;

public interface PostService {

    public PostListDTO list();

    public PostListDTO queryForList(String key);

    public PostListDTO getBlockPost(String key);

    public PostDTO getPostById(String id);

    public PostDTO editPost(PostDTO postDTO);

    public PostDTO createPost(PostDTO postDTO);

    public PostDTO deletePost(PostDTO postDTO);

}
