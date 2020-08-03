package com.zking.mapper;

import com.zking.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer tMessageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer tMessageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}