package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.ReplyDTO;
import com.hapiweb.test_block.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reply")
@ResponseBody
public class ReplyController {

    @Autowired
    ReplyService replyService;

    @PutMapping("/replyTo")
    public ReplyDTO replyTo(@RequestBody ReplyDTO replyDTO){
        return replyService.create(replyDTO);
    }

    @PostMapping("/editReply")
    public ReplyDTO editReply(@RequestBody ReplyDTO replyDTO){
        return replyService.editReply(replyDTO);
    }

    @DeleteMapping("/deleteReply")
    public ReplyDTO deleteReply(@RequestBody ReplyDTO replyDTO){
        return replyService.delete(replyDTO);
    }

}
