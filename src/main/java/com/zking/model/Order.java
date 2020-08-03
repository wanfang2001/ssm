package com.zking.model;

import java.util.Date;

public class Order {
    private Integer tOrderId;

    private Date tOrderCreatedate;

    public Order(Integer tOrderId, Date tOrderCreatedate) {
        this.tOrderId = tOrderId;
        this.tOrderCreatedate = tOrderCreatedate;
    }

    public Order() {
        super();
    }

    public Integer gettOrderId() {
        return tOrderId;
    }

    public void settOrderId(Integer tOrderId) {
        this.tOrderId = tOrderId;
    }

    public Date gettOrderCreatedate() {
        return tOrderCreatedate;
    }

    public void settOrderCreatedate(Date tOrderCreatedate) {
        this.tOrderCreatedate = tOrderCreatedate;
    }
}