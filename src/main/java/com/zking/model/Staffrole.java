package com.zking.model;

public class Staffrole {
    private Integer tStaffroleId;

    private String tStaffroleName;

    private String tStaffroleDescription;

    public Staffrole(Integer tStaffroleId, String tStaffroleName, String tStaffroleDescription) {
        this.tStaffroleId = tStaffroleId;
        this.tStaffroleName = tStaffroleName;
        this.tStaffroleDescription = tStaffroleDescription;
    }

    public Staffrole() {
        super();
    }

    public Integer gettStaffroleId() {
        return tStaffroleId;
    }

    public void settStaffroleId(Integer tStaffroleId) {
        this.tStaffroleId = tStaffroleId;
    }

    public String gettStaffroleName() {
        return tStaffroleName;
    }

    public void settStaffroleName(String tStaffroleName) {
        this.tStaffroleName = tStaffroleName;
    }

    public String gettStaffroleDescription() {
        return tStaffroleDescription;
    }

    public void settStaffroleDescription(String tStaffroleDescription) {
        this.tStaffroleDescription = tStaffroleDescription;
    }
}