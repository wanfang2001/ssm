package com.zking.model;

public class OrderUserss {
    private Integer tOstId;

    private Integer tOrderId;

    private Integer tUsersId;

    public OrderUserss(Integer tOstId, Integer tOrderId, Integer tUsersId) {
        this.tOstId = tOstId;
        this.tOrderId = tOrderId;
        this.tUsersId = tUsersId;
    }

    public OrderUserss() {
        super();
    }

    public Integer gettOstId() {
        return tOstId;
    }

    public void settOstId(Integer tOstId) {
        this.tOstId = tOstId;
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