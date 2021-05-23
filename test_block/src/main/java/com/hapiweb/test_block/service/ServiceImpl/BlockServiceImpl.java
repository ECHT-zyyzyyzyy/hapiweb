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

import java.util.List;

@Service
@UserLoginToken(required = true)
public class BlockServiceImpl implements BlockService {

    @Autowired
    BlockMapper blockMapper;

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
    public List<Block> list() {
        return blockMapper.selectByExample(null);
    }

    @Override
    public List<Block> queryForList(String key) {
        BlockExample blockExample = new BlockExample();
        BlockExample.Criteria criteria = blockExample.createCriteria();
        criteria.andNameLike("%" + key + "%");
        return blockMapper.selectByExample(blockExample);
    }
}
