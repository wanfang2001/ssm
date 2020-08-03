package com.zking.mapper;

import com.zking.model.OrderTeam;

public interface OrderTeamMapper {
    int deleteByPrimaryKey(Integer tOrsId);

    int insert(OrderTeam record);

    int insertSelective(OrderTeam record);

    OrderTeam selectByPrimaryKey(Integer tOrsId);

    int updateByPrimaryKeySelective(OrderTeam record);

    int updateByPrimaryKey(OrderTeam record);
}