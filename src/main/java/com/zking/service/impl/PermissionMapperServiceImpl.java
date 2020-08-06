package com.zking.service.impl;

import com.zking.mapper.PermissionMapper;
import com.zking.model.Permission;
import com.zking.service.IPermissionMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PermissionMapperServiceImpl implements IPermissionMapperService {

  @Autowired
  private PermissionMapper permissionMapper;

  @Override
  public int deleteByPrimaryKey(Integer tPerId) {
    return 0;
  }

  @Override
  public int insert(Permission record) {
    return 0;
  }

  @Override
  public int insertSelective(Permission record) {
    return 0;
  }

  @Override
  public Permission selectByPrimaryKey(Integer tPerId) {
    return null;
  }

  @Override
  public int updateByPrimaryKeySelective(Permission record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Permission record) {
    return 0;
  }

  @Override
  public List<Permission> queryrootNode() {
    List<Permission> permissions = permissionMapper.queryrootNode();
    for(Permission permission:permissions){
      //传参数
      //1) 父节点的ID=10 11 12
      //2) 当前父节点对象
      queryModelByPid(permission.gettPerId(),permission);
    }
    return permissions;
  }

  @Override
  public void queryModelByPid(Integer tpid, Permission permission) {
    List<Permission> permissions = permissionMapper.queryModuleByperid(tpid);
    for(Permission permission1:permissions){
      queryModelByPid(permission1.gettPerId(),permission1);
    }
    permission.setChildren(permissions);
  }
}
