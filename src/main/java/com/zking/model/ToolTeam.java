package com.zking.model;

public class ToolTeam {
    private Integer tTtId;

    private Integer tToolId;

    private Integer tTeamId;

    public ToolTeam(Integer tTtId, Integer tToolId, Integer tTeamId) {
        this.tTtId = tTtId;
        this.tToolId = tToolId;
        this.tTeamId = tTeamId;
    }

    public ToolTeam() {
        super();
    }

    public Integer gettTtId() {
        return tTtId;
    }

    public void settTtId(Integer tTtId) {
        this.tTtId = tTtId;
    }

    public Integer gettToolId() {
        return tToolId;
    }

    public void settToolId(Integer tToolId) {
        this.tToolId = tToolId;
    }

    public Integer gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(Integer tTeamId) {
        this.tTeamId = tTeamId;
    }
}