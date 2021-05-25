package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.ReplyDTO;
import com.hapiweb.test_block.dto.ReplyListDTO;

public interface ReplyService {

    public ReplyListDTO list(String postKey);

    //public ReplyListDTO queryForList(String postKey, String key);

    public ReplyDTO getReplyById(String id);

    public ReplyDTO editReply(ReplyDTO replyDTO);

    public ReplyDTO create(ReplyDTO replyDTO);

    public ReplyDTO delete(ReplyDTO replyDTO);

}
