package com.hapiweb.test_block.dto;

import com.hapiweb.test_block.entity.Block;
import lombok.Data;

import java.util.List;

@Data
public class BlockListDTO {

    private List<Block> blocks;
    private String token;

}
