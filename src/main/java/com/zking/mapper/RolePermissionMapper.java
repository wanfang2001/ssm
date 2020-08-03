package com.zking.mapper;

import com.zking.model.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer tRpId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer tRpId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}