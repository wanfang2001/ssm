package com.zking.model;

public class StaffrolePermission {
    private Integer tSpId;

    private Integer tStaffroleId;

    private Integer tPerId;

    public StaffrolePermission(Integer tSpId, Integer tStaffroleId, Integer tPerId) {
        this.tSpId = tSpId;
        this.tStaffroleId = tStaffroleId;
        this.tPerId = tPerId;
    }

    public StaffrolePermission() {
        super();
    }

    public Integer gettSpId() {
        return tSpId;
    }

    public void settSpId(Integer tSpId) {
        this.tSpId = tSpId;
    }

    public Integer gettStaffroleId() {
        return tStaffroleId;
    }

    public void settStaffroleId(Integer tStaffroleId) {
        this.tStaffroleId = tStaffroleId;
    }

    public Integer gettPerId() {
        return tPerId;
    }

    public void settPerId(Integer tPerId) {
        this.tPerId = tPerId;
    }
}