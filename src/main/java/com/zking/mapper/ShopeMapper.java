package com.zking.mapper;

import com.zking.model.Shope;

public interface ShopeMapper {
    int deleteByPrimaryKey(Integer tShopeId);

    int insert(Shope record);

    int insertSelective(Shope record);

    Shope selectByPrimaryKey(Integer tShopeId);

    int updateByPrimaryKeySelective(Shope record);

    int updateByPrimaryKey(Shope record);
}