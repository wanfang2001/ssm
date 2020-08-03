package com.zking.model;

public class UsersRole {
    private Integer tUrId;

    private Integer tUsersId;

    private Integer tRoleId;

    public UsersRole(Integer tUrId, Integer tUsersId, Integer tRoleId) {
        this.tUrId = tUrId;
        this.tUsersId = tUsersId;
        this.tRoleId = tRoleId;
    }

    public UsersRole() {
        super();
    }

    public Integer gettUrId() {
        return tUrId;
    }

    public void settUrId(Integer tUrId) {
        this.tUrId = tUrId;
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }

    public Integer gettRoleId() {
        return tRoleId;
    }

    public void settRoleId(Integer tRoleId) {
        this.tRoleId = tRoleId;
    }
}