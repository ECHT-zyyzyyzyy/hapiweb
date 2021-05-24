package com.hapiweb.test_block.service.ServiceImpl;

import com.hapiweb.test_block.dao.PostMapper;
import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;
import com.hapiweb.test_block.entity.Post;
import com.hapiweb.test_block.entity.PostExample;
import com.hapiweb.test_block.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public PostListDTO list() {
        List<Post> posts = postMapper.selectByExample(null);
        PostListDTO postListDTO = new PostListDTO();
        postListDTO.setPosts(posts);
        return postListDTO;
    }

    @Override
    public PostListDTO queryForList(String key) {
        PostExample postExample = new PostExample();
        PostExample.Criteria criteria = postExample.createCriteria();
        criteria.andTitleLike("%" + key + "%");
        List<Post> posts = postMapper.selectByExample(postExample);
        PostListDTO postListDTO = new PostListDTO();
        postListDTO.setPosts(posts);
        return postListDTO;
    }

    @Override
    public PostDTO getPostById(String id) {
        PostDTO postDTO = new PostDTO();
        postDTO.setPost(postMapper.selectByPrimaryKey(id));
        return postDTO;
    }

    @Override
    @Transactional
    public PostDTO editPost(PostDTO postDTO) {
        if(null != postMapper.selectByPrimaryKey(postDTO.getPost().getGenkey())){
            postMapper.updateByPrimaryKey(postDTO.getPost());
            return postDTO;
        }
        return null;
    }
}
