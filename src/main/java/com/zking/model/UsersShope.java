package com.zking.model;

public class UsersShope {
    private Integer tMsId;

    private Integer tUsersId;

    private Integer tShopeId;

    public UsersShope(Integer tMsId, Integer tUsersId, Integer tShopeId) {
        this.tMsId = tMsId;
        this.tUsersId = tUsersId;
        this.tShopeId = tShopeId;
    }

    public UsersShope() {
        super();
    }

    public Integer gettMsId() {
        return tMsId;
    }

    public void settMsId(Integer tMsId) {
        this.tMsId = tMsId;
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }

    public Integer gettShopeId() {
        return tShopeId;
    }

    public void settShopeId(Integer tShopeId) {
        this.tShopeId = tShopeId;
    }
}