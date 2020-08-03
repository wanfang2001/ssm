package com.zking.mapper;

import com.zking.model.StaffTeam;

public interface StaffTeamMapper {
    int deleteByPrimaryKey(Integer tStId);

    int insert(StaffTeam record);

    int insertSelective(StaffTeam record);

    StaffTeam selectByPrimaryKey(Integer tStId);

    int updateByPrimaryKeySelective(StaffTeam record);

    int updateByPrimaryKey(StaffTeam record);
}