package com.zking.model;

public class StaffTeam {
    private Integer tStId;

    private Integer tUsersId;

    private Integer tTeamId;

    public StaffTeam(Integer tStId, Integer tUsersId, Integer tTeamId) {
        this.tStId = tStId;
        this.tUsersId = tUsersId;
        this.tTeamId = tTeamId;
    }

    public StaffTeam() {
        super();
    }

    public Integer gettStId() {
        return tStId;
    }

    public void settStId(Integer tStId) {
        this.tStId = tStId;
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }

    public Integer gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(Integer tTeamId) {
        this.tTeamId = tTeamId;
    }
}