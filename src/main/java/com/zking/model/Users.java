package com.zking.model;

import java.util.Date;

public class Users {
    private Integer tUsersId;

    private String tUsersName;

    private String tUsersPassword;

    private String tUsersSale;

    private Date tUsersCreatedate;

    private Integer tUsersZt;

    public Users(Integer tUsersId, String tUsersName, String tUsersPassword, String tUsersSale, Date tUsersCreatedate, Integer tUsersZt) {
        this.tUsersId = tUsersId;
        this.tUsersName = tUsersName;
        this.tUsersPassword = tUsersPassword;
        this.tUsersSale = tUsersSale;
        this.tUsersCreatedate = tUsersCreatedate;
        this.tUsersZt = tUsersZt;
    }

    public Users() {
        super();
    }

    public Integer gettUsersId() {
        return tUsersId;
    }

    public void settUsersId(Integer tUsersId) {
        this.tUsersId = tUsersId;
    }

    public String gettUsersName() {
        return tUsersName;
    }

    public void settUsersName(String tUsersName) {
        this.tUsersName = tUsersName;
    }

    public String gettUsersPassword() {
        return tUsersPassword;
    }

    public void settUsersPassword(String tUsersPassword) {
        this.tUsersPassword = tUsersPassword;
    }

    public String gettUsersSale() {
        return tUsersSale;
    }

    public void settUsersSale(String tUsersSale) {
        this.tUsersSale = tUsersSale;
    }

    public Date gettUsersCreatedate() {
        return tUsersCreatedate;
    }

    public void settUsersCreatedate(Date tUsersCreatedate) {
        this.tUsersCreatedate = tUsersCreatedate;
    }

    public Integer gettUsersZt() {
        return tUsersZt;
    }

    public void settUsersZt(Integer tUsersZt) {
        this.tUsersZt = tUsersZt;
    }
}