package com.zking.mapper;

import com.zking.model.OrderUserss;

public interface OrderUserssMapper {
    int deleteByPrimaryKey(Integer tOstId);

    int insert(OrderUserss record);

    int insertSelective(OrderUserss record);

    OrderUserss selectByPrimaryKey(Integer tOstId);

    int updateByPrimaryKeySelective(OrderUserss record);

    int updateByPrimaryKey(OrderUserss record);
}