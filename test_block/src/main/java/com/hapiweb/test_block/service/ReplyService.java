package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.ReplyDTO;
import com.hapiweb.test_block.dto.ReplyListDTO;
import com.hapiweb.test_block.entity.Reply;

import java.util.List;

public interface ReplyService {

    public ReplyListDTO list(String postKey);

    //public ReplyListDTO queryForList(String postKey, String key);

    public ReplyDTO getReplyById(String id);

    public ReplyDTO editReply(ReplyDTO replyDTO);

    public ReplyDTO create(ReplyDTO replyDTO);

    public ReplyDTO delete(ReplyDTO replyDTO);

    public Integer deleteByPostGK(String postGK);

    public List<Reply> getReplyByPostGK(String key);
}
