package com.hapiweb.test_block.dto;

import com.hapiweb.test_block.entity.Reply;
import lombok.Data;

import java.util.List;

@Data
public class ReplyListDTO {

    private List<Reply> replies;
    private String token;

}
