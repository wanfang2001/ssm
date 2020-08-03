package com.zking.model;

public class Business {
    private Integer tBusinessId;

    private String tBusinessName;

    public Business(Integer tBusinessId, String tBusinessName) {
        this.tBusinessId = tBusinessId;
        this.tBusinessName = tBusinessName;
    }

    public Business() {
        super();
    }

    public Integer gettBusinessId() {
        return tBusinessId;
    }

    public void settBusinessId(Integer tBusinessId) {
        this.tBusinessId = tBusinessId;
    }

    public String gettBusinessName() {
        return tBusinessName;
    }

    public void settBusinessName(String tBusinessName) {
        this.tBusinessName = tBusinessName;
    }
}