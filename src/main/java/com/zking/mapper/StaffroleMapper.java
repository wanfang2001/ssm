package com.zking.mapper;

import com.zking.model.Staffrole;

public interface StaffroleMapper {
    int deleteByPrimaryKey(Integer tStaffroleId);

    int insert(Staffrole record);

    int insertSelective(Staffrole record);

    Staffrole selectByPrimaryKey(Integer tStaffroleId);

    int updateByPrimaryKeySelective(Staffrole record);

    int updateByPrimaryKey(Staffrole record);
}