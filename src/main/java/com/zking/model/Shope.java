package com.zking.model;

import java.util.Date;

public class Shope {
    private Integer tShopeId;

    private String tShopeName;

    private String tShopeAddress;

    private Date tShopeCreatedate;

    public Shope(Integer tShopeId, String tShopeName, String tShopeAddress, Date tShopeCreatedate) {
        this.tShopeId = tShopeId;
        this.tShopeName = tShopeName;
        this.tShopeAddress = tShopeAddress;
        this.tShopeCreatedate = tShopeCreatedate;
    }

    public Shope() {
        super();
    }

    public Integer gettShopeId() {
        return tShopeId;
    }

    public void settShopeId(Integer tShopeId) {
        this.tShopeId = tShopeId;
    }

    public String gettShopeName() {
        return tShopeName;
    }

    public void settShopeName(String tShopeName) {
        this.tShopeName = tShopeName;
    }

    public String gettShopeAddress() {
        return tShopeAddress;
    }

    public void settShopeAddress(String tShopeAddress) {
        this.tShopeAddress = tShopeAddress;
    }

    public Date gettShopeCreatedate() {
        return tShopeCreatedate;
    }

    public void settShopeCreatedate(Date tShopeCreatedate) {
        this.tShopeCreatedate = tShopeCreatedate;
    }
}