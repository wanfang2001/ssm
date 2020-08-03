package com.zking.mapper;

import com.zking.model.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer tPerId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer tPerId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}