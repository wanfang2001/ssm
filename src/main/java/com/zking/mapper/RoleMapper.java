package com.zking.mapper;

import com.zking.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer tRoleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer tRoleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}