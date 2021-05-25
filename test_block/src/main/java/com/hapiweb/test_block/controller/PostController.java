package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;
import com.hapiweb.test_block.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/list")
    public PostListDTO list(){
        PostListDTO list = postService.list();
        return list;
    }

    @GetMapping("/queryForList")
    public PostListDTO queryForList(@PathVariable String key){
        PostListDTO postListDTO = postService.queryForList(key);
        return postListDTO;
    }

}
