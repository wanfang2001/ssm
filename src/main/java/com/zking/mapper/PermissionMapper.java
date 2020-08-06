package com.zking.mapper;

import com.zking.model.Permission;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer tPerId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer tPerId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

  /**
   * 获取根节点
   * @return
   */
  List<Permission> queryrootNode();


  /**
   * 根据根节点pid查询子id
   * @param tpid
   * @param permission
   */
    void queryModelByPid(Integer tpid,Permission permission);


  /**
   * 根据根节点pid查询子id
   * @param tpid
   * @return
   */
    List<Permission> queryModuleByperid(Integer tpid);
}
