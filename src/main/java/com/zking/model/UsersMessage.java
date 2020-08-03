package com.zking.model;

public class UsersMessage {
    private Integer tUmId;

    private Integer tUsersId;

    private Integer tMessageId;

    public UsersMessage(Integer tUmId, Integer tUsersId, Integer tMessageId) {
        this.tUmId = tUmId;
        this.tUsersId = tUsersId;
        this.tMessageId = tMessageId;
    }

    public UsersMessage() {
        super();
    }

    public Integer gettUmId() {
        return tUmId;
    }

    public void settUmId(Integer tUmId) {
        this.tUmId = tUmId;
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }

    public Integer gettMessageId() {
        return tMessageId;
    }

    public void settMessageId(Integer tMessageId) {
        this.tMessageId = tMessageId;
    }
}