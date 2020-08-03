package com.zking.model;

public class OrderUsers {
    private Integer tOsId;

    private Integer tOrderId;

    private Integer tUsersId;

    public OrderUsers(Integer tOsId, Integer tOrderId, Integer tUsersId) {
        this.tOsId = tOsId;
        this.tOrderId = tOrderId;
        this.tUsersId = tUsersId;
    }

    public OrderUsers() {
        super();
    }

    public Integer gettOsId() {
        return tOsId;
    }

    public void settOsId(Integer tOsId) {
        this.tOsId = tOsId;
    }

    public Integer gettOrderId() {
        return tOrderId;
    }

    public void settOrderId(Integer tOrderId) {
        this.tOrderId = tOrderId;
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }
}