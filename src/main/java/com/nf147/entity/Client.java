package com.nf147.entity;

import java.util.Date;

public class Client {
    private String clientID;

    private String clientName;

    private Integer clientSex;

    private String userID;

    private String clientPwd;

    private String clientTEL;

    private Date clientDate;

    private String clientSite;

    private String clientNotes;

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID == null ? null : clientID.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public Integer getClientSex() {
        return clientSex;
    }

    public void setClientSex(Integer clientSex) {
        this.clientSex = clientSex;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getClientPwd() {
        return clientPwd;
    }

    public void setClientPwd(String clientPwd) {
        this.clientPwd = clientPwd == null ? null : clientPwd.trim();
    }

    public String getClientTEL() {
        return clientTEL;
    }

    public void setClientTEL(String clientTEL) {
        this.clientTEL = clientTEL == null ? null : clientTEL.trim();
    }

    public Date getClientDate() {
        return clientDate;
    }

    public void setClientDate(Date clientDate) {
        this.clientDate = clientDate;
    }

    public String getClientSite() {
        return clientSite;
    }

    public void setClientSite(String clientSite) {
        this.clientSite = clientSite == null ? null : clientSite.trim();
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String clientNotes) {
        this.clientNotes = clientNotes == null ? null : clientNotes.trim();
    }
}