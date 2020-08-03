package com.zking.model;

public class Team {
    private Integer tTeamId;

    private String tTeamName;

    public Team(Integer tTeamId, String tTeamName) {
        this.tTeamId = tTeamId;
        this.tTeamName = tTeamName;
    }

    public Team() {
        super();
    }

    public Integer gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(Integer tTeamId) {
        this.tTeamId = tTeamId;
    }

    public String gettTeamName() {
        return tTeamName;
    }

    public void settTeamName(String tTeamName) {
        this.tTeamName = tTeamName;
    }
}