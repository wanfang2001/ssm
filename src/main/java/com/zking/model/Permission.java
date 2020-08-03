package com.zking.model;

public class Permission {
    private Integer tPerId;

    private String tPerName;

    private Integer tPid;

    private String tPerPermission;

    public Permission(Integer tPerId, String tPerName, Integer tPid, String tPerPermission) {
        this.tPerId = tPerId;
        this.tPerName = tPerName;
        this.tPid = tPid;
        this.tPerPermission = tPerPermission;
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
}