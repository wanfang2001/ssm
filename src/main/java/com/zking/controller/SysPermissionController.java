package com.zking.controller;
import com.zking.model.Permission;
import com.zking.service.IPermissionMapperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("permission")
public class SysPermissionController {

  @Autowired
  private IPermissionMapperService iPermissionMapperService;


  @RequestMapping(value="/queryNode")
  @ResponseBody
  public List<Permission> queryNode(){
    List<Permission> permissions = iPermissionMapperService.queryrootNode();
    return  permissions;
  }

}
