package com.zking.model;

import java.util.Date;

public class Message {
    private Integer tMessageId;

    private String tMessageContent;

    private Date tMessageCreatedate;

    public Message(Integer tMessageId, String tMessageContent, Date tMessageCreatedate) {
        this.tMessageId = tMessageId;
        this.tMessageContent = tMessageContent;
        this.tMessageCreatedate = tMessageCreatedate;
    }

    public Message() {
        super();
    }

    public Integer gettMessageId() {
        return tMessageId;
    }

    public void settMessageId(Integer tMessageId) {
        this.tMessageId = tMessageId;
    }

    public String gettMessageContent() {
        return tMessageContent;
    }

    public void settMessageContent(String tMessageContent) {
        this.tMessageContent = tMessageContent;
    }

    public Date gettMessageCreatedate() {
        return tMessageCreatedate;
    }

    public void settMessageCreatedate(Date tMessageCreatedate) {
        this.tMessageCreatedate = tMessageCreatedate;
    }
}