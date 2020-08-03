package com.zking.mapper;

import com.zking.model.Business;

public interface BusinessMapper {
    int deleteByPrimaryKey(Integer tBusinessId);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Integer tBusinessId);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}