package com.zking.mapper;

import com.zking.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer tUsersId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer tUsersId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}