package com.zking.model;

public class StaffBusiness {
    private Integer tSbId;

    private Integer tTeamId;

    private Integer tBusinessId;

    public StaffBusiness(Integer tSbId, Integer tTeamId, Integer tBusinessId) {
        this.tSbId = tSbId;
        this.tTeamId = tTeamId;
        this.tBusinessId = tBusinessId;
    }

    public StaffBusiness() {
        super();
    }

    public Integer gettSbId() {
        return tSbId;
    }

    public void settSbId(Integer tSbId) {
        this.tSbId = tSbId;
    }

    public Integer gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(Integer tTeamId) {
        this.tTeamId = tTeamId;
    }

    public Integer gettBusinessId() {
        return tBusinessId;
    }

    public void settBusinessId(Integer tBusinessId) {
        this.tBusinessId = tBusinessId;
    }
}