package com.zking.mapper;

import com.zking.model.Tool;

public interface ToolMapper {
    int deleteByPrimaryKey(Integer tToolId);

    int insert(Tool record);

    int insertSelective(Tool record);

    Tool selectByPrimaryKey(Integer tToolId);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);
}