package com.hapiweb.test_block.service.ServiceImpl;

import com.hapiweb.test_block.JWT.UserLoginToken;
import com.hapiweb.test_block.dao.BlockMapper;
import com.hapiweb.test_block.dto.BlockDTO;
import com.hapiweb.test_block.entity.Block;
import com.hapiweb.test_block.entity.BlockExample;
import com.hapiweb.test_block.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@UserLoginToken(required = true)
public class BlockServiceImpl implements BlockService {

    @Autowired
    BlockMapper blockMapper;

    public static synchronized String getGenkey(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Override
    @Transactional
    public boolean editBlock(BlockDTO blockDTO) {
        Block block = blockMapper.selectByPrimaryKey(blockDTO.getBlock().getGenkey());
        if(block != null){
            blockMapper.updateByPrimaryKey(blockDTO.getBlock());
            return true;
        }else{
            throw new RuntimeException("无此板块");
        }
    }

    @Override
    public BlockDTO getBlockByName(BlockDTO blockDTO) {
        BlockExample blockExample = new BlockExample();
        BlockExample.Criteria criteria = blockExample.createCriteria();
        criteria.andNameEqualTo(blockDTO.getBlock().getName());
        List<Block> blocks = blockMapper.selectByExample(blockExample);
        if(blocks.size()!=0){
            BlockDTO blockDTO1 = new BlockDTO();
            blockDTO1.setBlock(blocks.get(0));
            return blockDTO1;
        }
        return null;
    }

    @Override
    public BlockDTO getBlockById(String id) {
        Block block = blockMapper.selectByPrimaryKey(id);
        BlockDTO blockDTO = new BlockDTO();
        blockDTO.setBlock(block);
        return blockDTO;
    }

    @Override
    public List<Block> list() {
        return blockMapper.selectByExample(null).stream().sorted(Comparator.comparing(Block::getName)).collect(Collectors.toList());
    }

    @Override
    public List<Block> queryForList(String key) {
        BlockExample blockExample = new BlockExample();
        BlockExample.Criteria criteria = blockExample.createCriteria();
        criteria.andNameLike("%" + key + "%");
        return blockMapper.selectByExample(blockExample);
    }

    @Override
    @Transactional
    public BlockDTO addBlock(BlockDTO blockDTO) {
        Block block = blockDTO.getBlock();
        BlockExample blockExample = new BlockExample();
        blockExample.createCriteria().andNameEqualTo(block.getName());
        List<Block> blocks = blockMapper.selectByExample(blockExample);
        if(blocks.size()==0){
            do {
                block.setGenkey(getGenkey());
            }while(blockMapper.selectByPrimaryKey(block.getGenkey())!=null);
            blockMapper.insert(block);
        }
        BlockDTO blockDTO1 = new BlockDTO();
        blockDTO1.setBlock(block);
        return blockDTO1;
    }
}
