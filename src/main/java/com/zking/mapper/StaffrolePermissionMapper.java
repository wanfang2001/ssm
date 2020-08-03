package com.zking.mapper;

import com.zking.model.StaffrolePermission;

public interface StaffrolePermissionMapper {
    int deleteByPrimaryKey(Integer tSpId);

    int insert(StaffrolePermission record);

    int insertSelective(StaffrolePermission record);

    StaffrolePermission selectByPrimaryKey(Integer tSpId);

    int updateByPrimaryKeySelective(StaffrolePermission record);

    int updateByPrimaryKey(StaffrolePermission record);
}