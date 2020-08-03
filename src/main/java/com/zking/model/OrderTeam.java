package com.zking.model;

public class OrderTeam {
    private Integer tOrsId;

    private Integer tOrderId;

    private Integer tTeamId;

    public OrderTeam(Integer tOrsId, Integer tOrderId, Integer tTeamId) {
        this.tOrsId = tOrsId;
        this.tOrderId = tOrderId;
        this.tTeamId = tTeamId;
    }

    public OrderTeam() {
        super();
    }

    public Integer gettOrsId() {
        return tOrsId;
    }

    public void settOrsId(Integer tOrsId) {
        this.tOrsId = tOrsId;
    }

    public Integer gettOrderId() {
        return tOrderId;
    }

    public void settOrderId(Integer tOrderId) {
        this.tOrderId = tOrderId;
    }

    public Integer gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(Integer tTeamId) {
        this.tTeamId = tTeamId;
    }
}