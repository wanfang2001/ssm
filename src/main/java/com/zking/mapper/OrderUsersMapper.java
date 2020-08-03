package com.zking.mapper;

import com.zking.model.OrderUsers;

public interface OrderUsersMapper {
    int deleteByPrimaryKey(Integer tOsId);

    int insert(OrderUsers record);

    int insertSelective(OrderUsers record);

    OrderUsers selectByPrimaryKey(Integer tOsId);

    int updateByPrimaryKeySelective(OrderUsers record);

    int updateByPrimaryKey(OrderUsers record);
}