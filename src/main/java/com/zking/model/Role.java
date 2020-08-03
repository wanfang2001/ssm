package com.zking.model;

public class Role {
    private Integer tRoleId;

    private String tRoleName;

    private String tRoleDescription;

    public Role(Integer tRoleId, String tRoleName, String tRoleDescription) {
        this.tRoleId = tRoleId;
        this.tRoleName = tRoleName;
        this.tRoleDescription = tRoleDescription;
    }

    public Role() {
        super();
    }

    public Integer gettRoleId() {
        return tRoleId;
    }

    public void settRoleId(Integer tRoleId) {
        this.tRoleId = tRoleId;
    }

    public String gettRoleName() {
        return tRoleName;
    }

    public void settRoleName(String tRoleName) {
        this.tRoleName = tRoleName;
    }

    public String gettRoleDescription() {
        return tRoleDescription;
    }

    public void settRoleDescription(String tRoleDescription) {
        this.tRoleDescription = tRoleDescription;
    }
}