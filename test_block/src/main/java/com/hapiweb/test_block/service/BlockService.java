package com.hapiweb.test_block.service;

import com.hapiweb.test_block.dto.BlockDTO;
import com.hapiweb.test_block.entity.Block;

import java.util.List;

public interface BlockService {

    public boolean editBlock(BlockDTO blockDTO);

    public BlockDTO getBlockById(String id);

    public BlockDTO getBlockByName(BlockDTO blockDTO);

    public List<Block> list();

    public List<Block> queryForList(String key);
}
