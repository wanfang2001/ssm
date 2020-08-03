package com.zking.model;

public class RolePermission {
    private Integer tRpId;

    private Integer tRoleId;

    private Integer tPerId;

    public RolePermission(Integer tRpId, Integer tRoleId, Integer tPerId) {
        this.tRpId = tRpId;
        this.tRoleId = tRoleId;
        this.tPerId = tPerId;
    }

    public RolePermission() {
        super();
    }

    public Integer gettRpId() {
        return tRpId;
    }

    public void settRpId(Integer tRpId) {
        this.tRpId = tRpId;
    }

    public Integer gettRoleId() {
        return tRoleId;
    }

    public void settRoleId(Integer tRoleId) {
        this.tRoleId = tRoleId;
    }

    public Integer gettPerId() {
        return tPerId;
    }

    public void settPerId(Integer tPerId) {
        this.tPerId = tPerId;
    }
}