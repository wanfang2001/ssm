package com.zking.mapper;

import com.zking.model.StaffBusiness;

public interface StaffBusinessMapper {
    int deleteByPrimaryKey(Integer tSbId);

    int insert(StaffBusiness record);

    int insertSelective(StaffBusiness record);

    StaffBusiness selectByPrimaryKey(Integer tSbId);

    int updateByPrimaryKeySelective(StaffBusiness record);

    int updateByPrimaryKey(StaffBusiness record);
}