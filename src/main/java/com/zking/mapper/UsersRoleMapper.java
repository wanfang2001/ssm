package com.zking.mapper;

import com.zking.model.UsersRole;

public interface UsersRoleMapper {
    int deleteByPrimaryKey(Integer tUrId);

    int insert(UsersRole record);

    int insertSelective(UsersRole record);

    UsersRole selectByPrimaryKey(Integer tUrId);

    int updateByPrimaryKeySelective(UsersRole record);

    int updateByPrimaryKey(UsersRole record);
}