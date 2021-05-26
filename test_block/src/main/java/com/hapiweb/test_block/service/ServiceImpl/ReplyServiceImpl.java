package com.hapiweb.test_block.service.ServiceImpl;

import com.hapiweb.test_block.dao.ReplyMapper;
import com.hapiweb.test_block.dto.ReplyDTO;
import com.hapiweb.test_block.dto.ReplyListDTO;
import com.hapiweb.test_block.entity.Reply;
import com.hapiweb.test_block.entity.ReplyExample;
import com.hapiweb.test_block.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    ReplyMapper replyMapper;

    public String getPK(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Override
    public ReplyListDTO list(String postKey) {
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria().andPostGkEqualTo(postKey);
        List<Reply> replies = replyMapper.selectByExample(replyExample);
        ReplyListDTO replyListDTO = new ReplyListDTO();
        replyListDTO.setReplies(replies);
        return replyListDTO;
    }

//    @Override
//    public ReplyListDTO queryForList(String postKey, String key) {
//        ReplyExample replyExample = new ReplyExample();
//        replyExample.createCriteria().andPostGkEqualTo(postKey);
//        List<Reply> replies = replyMapper.selectByExample(replyExample);
//        ReplyListDTO replyListDTO = new ReplyListDTO();
//        replyListDTO.setReplies(replies);
//
//        return null;
//    }

    @Override
    public ReplyDTO getReplyById(String id) {
        Reply reply = replyMapper.selectByPrimaryKey(id);
        if(null != reply){
            ReplyDTO replyDTO = new ReplyDTO();
            replyDTO.setReply(reply);
            return replyDTO;
        }
        return null;
    }

    @Override
    public ReplyDTO editReply(ReplyDTO replyDTO) {
        if(null != replyMapper.selectByPrimaryKey(replyDTO.getReply().getGenkey()))
            if(1 == replyMapper.updateByPrimaryKey(replyDTO.getReply()))
                return replyDTO;
        return null;
    }

    @Override
    public ReplyDTO create(ReplyDTO replyDTO) {
        Reply reply = replyDTO.getReply();
        reply.setGenkey(getPK());
        while(null != replyMapper.selectByPrimaryKey(reply.getGenkey())){
            reply.setGenkey(getPK());
        }
        if(1 != replyMapper.insert(reply))
            return null;
        return replyDTO;
    }

    @Override
    public ReplyDTO delete(ReplyDTO replyDTO) {
        try{
            delete(replyDTO.getReply());
        }catch(RuntimeException e){
            e.printStackTrace();
            return null;
        }
        return new ReplyDTO();
    }

    public boolean delete(Reply reply){
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria().andReplyToGkEqualTo(reply.getGenkey());
        List<Reply> replies = replyMapper.selectByExample(replyExample);
        if(replies.size()!=0)
            replies.stream().map( item -> {
                return delete(item);
            }).count();
        if(1== replyMapper.deleteByPrimaryKey(reply.getGenkey()))
            return true;
        throw new RuntimeException("回复删除错误");
    }

    @Override
    @Transactional
    public Integer deleteByPostGK(String postGK) {
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria().andPostGkEqualTo(postGK);
        return replyMapper.deleteByExample(replyExample);
    }

    @Override
    @Transactional
    public List<Reply> getReplyByPostGK(String key) {
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria().andPostGkEqualTo(key);
        return replyMapper.selectByExample(replyExample);
    }
}
