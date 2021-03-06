package com.hapiweb.test_block.service.ServiceImpl;

import com.hapiweb.test_block.dao.PostMapper;
import com.hapiweb.test_block.dto.PostDTO;
import com.hapiweb.test_block.dto.PostListDTO;
import com.hapiweb.test_block.entity.Post;
import com.hapiweb.test_block.entity.PostExample;
import com.hapiweb.test_block.service.PostService;
import com.hapiweb.test_block.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private ReplyService replyService;

    public String getGK(){
        return UUID.randomUUID().toString().replace("-", "");
    }

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
    @Transactional
    public PostDTO getPostById(String id) {
        PostDTO postDTO = new PostDTO();
        postDTO.setPost(postMapper.selectByPrimaryKey(id));
        postDTO.setReplies(replyService.getReplyByPostGK(id));
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

    @Override
    @Transactional
    public PostDTO createPost(PostDTO postDTO) {
        Post post = postDTO.getPost();
        if(post!=null&&post.getTitle()!=null&&post.getAuthorGk()!=null&&post.getTitle().trim()!=""&&post.getAuthorGk().trim()!=""){
            post.setGenkey(getGK());
            if(postMapper.selectByPrimaryKey(post.getGenkey())==null){
                postMapper.insert(post);
                return postDTO;
            }
        }
        return null;
    }

    @Override
    @Transactional
    public PostDTO deletePost(PostDTO postDTO) {
        if(postMapper.selectByPrimaryKey(postDTO.getPost().getGenkey())!=null){
            replyService.deleteByPostGK(postDTO.getPost().getGenkey());
            postMapper.deleteByPrimaryKey(postDTO.getPost().getGenkey());
            return new PostDTO();
        }
        return null;
    }

    @Override
    @Transactional
    public PostListDTO getBlockPost(String key) {
        PostExample postExample = new PostExample();
        postExample.createCriteria().andBlockGkEqualTo(key);
        List<Post> posts = postMapper.selectByExample(postExample).stream().sorted(Comparator.comparing(Post::getTitle)).collect(Collectors.toList());
        PostListDTO postListDTO = new PostListDTO();
        postListDTO.setPosts(posts);
        return postListDTO;
    }
}
