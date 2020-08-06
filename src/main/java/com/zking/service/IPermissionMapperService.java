package com.zking.service;
import org.springframework.transaction.annotation.Transactional;
import com.zking.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
public interface IPermissionMapperService {
    int deleteByPrimaryKey(Integer tPerId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer tPerId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);


  List<Permission> queryrootNode();


    void queryModelByPid(Integer tpid, Permission permission);



}
