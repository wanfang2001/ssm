package com.zking.mapper;

import com.zking.model.UsersShope;

public interface UsersShopeMapper {
    int deleteByPrimaryKey(Integer tMsId);

    int insert(UsersShope record);

    int insertSelective(UsersShope record);

    UsersShope selectByPrimaryKey(Integer tMsId);

    int updateByPrimaryKeySelective(UsersShope record);

    int updateByPrimaryKey(UsersShope record);
}