package com.zking.mapper;

import com.zking.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer tOrderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer tOrderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}