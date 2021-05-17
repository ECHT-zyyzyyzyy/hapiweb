package com.hapiweb.test_block.dao;

import com.hapiweb.test_block.entity.Block;
import com.hapiweb.test_block.entity.BlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockMapper {
    long countByExample(BlockExample example);

    int deleteByExample(BlockExample example);

    int deleteByPrimaryKey(String genkey);

    int insert(Block record);

    int insertSelective(Block record);

    List<Block> selectByExample(BlockExample example);

    Block selectByPrimaryKey(String genkey);

    int updateByExampleSelective(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByExample(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
}