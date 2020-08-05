package com.zking.mapper;

import com.zking.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(Integer tUsersId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer tUsersId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    /**
     * 用户登录
     * @param tUsersName
     * @return
     */
    Users userLogin(@Param("tUsersName") String tUsersName);

    /**
     * 获取用户获取的角色名
     * @param tUsersName
     * @return
     */
    Set<String>  findRole(@Param("tUsersName") String tUsersName);




    /**
     * 获取用户的权限
     * @param tUsersName
     * @return
     */

    Set<String> findPermission(@Param("tUsersName") String tUsersName);



}