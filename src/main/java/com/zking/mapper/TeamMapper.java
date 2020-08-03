package com.zking.mapper;

import com.zking.model.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer tTeamId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer tTeamId);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}