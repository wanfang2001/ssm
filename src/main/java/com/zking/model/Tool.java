package com.zking.model;

public class Tool {
    private Integer tToolId;

    private String tToolName;

    private String tToolCount;

    public Tool(Integer tToolId, String tToolName, String tToolCount) {
        this.tToolId = tToolId;
        this.tToolName = tToolName;
        this.tToolCount = tToolCount;
    }

    public Tool() {
        super();
    }

    public Integer gettToolId() {
        return tToolId;
    }

    public void settToolId(Integer tToolId) {
        this.tToolId = tToolId;
    }

    public String gettToolName() {
        return tToolName;
    }

    public void settToolName(String tToolName) {
        this.tToolName = tToolName;
    }

    public String gettToolCount() {
        return tToolCount;
    }

    public void settToolCount(String tToolCount) {
        this.tToolCount = tToolCount;
    }
}