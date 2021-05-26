package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;
import com.hapiweb.test_block.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@ResponseBody
public class PostController {

    @Autowired
    PostService postService;
    private PostDTO postDTO;

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

    @GetMapping("/getPostByGK")
    public PostDTO getPostByGK(@PathVariable String key){
        PostDTO postById = postService.getPostById(key);
        return postById;
    }

    @DeleteMapping("/delete")
    public PostDTO delete(@RequestBody PostDTO postDTO){
        this.postDTO = postDTO;
        return postService.deletePost(postDTO);
    }

    @PutMapping("/create")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);
    }

    @PostMapping("/edit")
    public PostDTO editPost(@RequestBody PostDTO postDTO){
        return postService.editPost(postDTO);
    }

}
