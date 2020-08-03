package com.zking.mapper;

import com.zking.model.UsersMessage;

public interface UsersMessageMapper {
    int deleteByPrimaryKey(Integer tUmId);

    int insert(UsersMessage record);

    int insertSelective(UsersMessage record);

    UsersMessage selectByPrimaryKey(Integer tUmId);

    int updateByPrimaryKeySelective(UsersMessage record);

    int updateByPrimaryKey(UsersMessage record);
}