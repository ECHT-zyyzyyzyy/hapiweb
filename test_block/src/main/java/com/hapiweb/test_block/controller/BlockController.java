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

    @GetMapping("/queryForList")
    public BlockListDTO queryForList(@PathVariable String key){
        List<Block> list = blockService.queryForList(key);
        BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlocks(list);
        return blockListDTO;
    }

    @GetMapping("/getBlockById")
    public BlockDTO getBlock(@PathVariable String id){
        return blockService.getBlockById(id);
    }

    @PostMapping("/editBlock")
    public BlockDTO editBlock(@RequestBody BlockDTO blockDTO){
        if(blockService.editBlock(blockDTO))
            return blockDTO;
        BlockDTO blockDTO1 = new BlockDTO();
        return blockDTO1;
    }

    @PostMapping("/addBlock")
    public BlockDTO addBlock(@RequestBody BlockDTO blockIn){
        return blockService.addBlock(blockIn);
    }

}
