package com.nf147.entity;

import java.util.Date;

public class Connect {
    private String connectID;

    private String connectStart;

    private String connectMiddle;

    private String connectTerminus;

    private Integer connectType;

    private Date connectDate;

    private String connectNotes;

    public String getConnectID() {
        return connectID;
    }

    public void setConnectID(String connectID) {
        this.connectID = connectID == null ? null : connectID.trim();
    }

    public String getConnectStart() {
        return connectStart;
    }

    public void setConnectStart(String connectStart) {
        this.connectStart = connectStart == null ? null : connectStart.trim();
    }

    public String getConnectMiddle() {
        return connectMiddle;
    }

    public void setConnectMiddle(String connectMiddle) {
        this.connectMiddle = connectMiddle == null ? null : connectMiddle.trim();
    }

    public String getConnectTerminus() {
        return connectTerminus;
    }

    public void setConnectTerminus(String connectTerminus) {
        this.connectTerminus = connectTerminus == null ? null : connectTerminus.trim();
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public Date getConnectDate() {
        return connectDate;
    }

    public void setConnectDate(Date connectDate) {
        this.connectDate = connectDate;
    }

    public String getConnectNotes() {
        return connectNotes;
    }

    public void setConnectNotes(String connectNotes) {
        this.connectNotes = connectNotes == null ? null : connectNotes.trim();
    }
}