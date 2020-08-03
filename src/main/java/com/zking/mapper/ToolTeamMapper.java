package com.zking.mapper;

import com.zking.model.ToolTeam;

public interface ToolTeamMapper {
    int deleteByPrimaryKey(Integer tTtId);

    int insert(ToolTeam record);

    int insertSelective(ToolTeam record);

    ToolTeam selectByPrimaryKey(Integer tTtId);

    int updateByPrimaryKeySelective(ToolTeam record);

    int updateByPrimaryKey(ToolTeam record);
}