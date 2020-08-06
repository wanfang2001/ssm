package com.zking.model;

import java.util.ArrayList;
import java.util.List;

public class Permission {
    private Integer tPerId;

    private String tPerName;

    private Integer tPid;

    private String tPerPermission;

    private String tUrl;

    /**
     * 子节点
     */
    private List<Permission>  children = new ArrayList<Permission>();

  public List<Permission> getChildren() {
    return children;
  }

  public void setChildren(List<Permission> children) {
    this.children = children;
  }

  public Permission(Integer tPerId, String tPerName, Integer tPid, String tPerPermission, String tUrl) {
        this.tPerId = tPerId;
        this.tPerName = tPerName;
        this.tPid = tPid;
        this.tPerPermission = tPerPermission;
        this.tUrl = tUrl;
    }

    public Permission() {
        super();
    }

    public Integer gettPerId() {
        return tPerId;
    }

    public void settPerId(Integer tPerId) {
        this.tPerId = tPerId;
    }

    public String gettPerName() {
        return tPerName;
    }

    public void settPerName(String tPerName) {
        this.tPerName = tPerName;
    }

    public Integer gettPid() {
        return tPid;
    }

    public void settPid(Integer tPid) {
        this.tPid = tPid;
    }

    public String gettPerPermission() {
        return tPerPermission;
    }

    public void settPerPermission(String tPerPermission) {
        this.tPerPermission = tPerPermission;
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }
}
