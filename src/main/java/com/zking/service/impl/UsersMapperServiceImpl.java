package com.zking.service.impl;

import com.zking.mapper.UsersMapper;
import com.zking.model.Users;
import com.zking.service.IUsersMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UsersMapperServiceImpl implements IUsersMapperService {

  @Autowired
  private UsersMapper usersMapper;


  @Override
  public int deleteByPrimaryKey(Integer tUsersId) {
    return 0;
  }

  @Override
  public int insert(Users record) {
    return 0;
  }

  @Override
  public int insertSelective(Users record) {
    return 0;
  }

  @Override
  public Users selectByPrimaryKey(Integer tUsersId) {
    return null;
  }

  @Override
  public int updateByPrimaryKeySelective(Users record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Users record) {
    return 0;
  }

  @Override
  public Users userLogin(String tUsersName) {
    return usersMapper.userLogin(tUsersName);
  }

  @Override
  public Set<String> findRole(String username) {
    return usersMapper.findRole(username);
  }

  @Override
  public Set<String> findPermission(String tUsersName) {
    return usersMapper.findPermission(tUsersName);
  }
}
