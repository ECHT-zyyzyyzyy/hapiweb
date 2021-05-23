package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.dto.BlockDTO;
import com.hapiweb.test_block.dto.BlockListDTO;
import com.hapiweb.test_block.entity.Block;
import com.hapiweb.test_block.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

    @Autowired
    BlockService blockService;

    @GetMapping("/list")
    public BlockListDTO list(){
        List<Block> list = blockService.list();
        BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlocks(list);
        return blockListDTO;
    }

}
