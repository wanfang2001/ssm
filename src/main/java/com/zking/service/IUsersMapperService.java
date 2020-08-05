package com.zking.service;

import com.zking.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface IUsersMapperService {

   /* int deleteByPrimaryKey(Integer tUsersId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer tUsersId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);*/

    @Transactional(readOnly = true)
    Users userLogin(String tUsersName);




    @Transactional(readOnly = true)
    Set<String> findRole(String username);

    @Transactional(readOnly = true)
    Set<String> findPermission(String tUsersName);
}