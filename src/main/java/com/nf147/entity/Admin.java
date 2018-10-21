package com.nf147.entity;

public class Admin {
    private String adminID;

    private String adminName;

    private Integer adminSex;

    private String userID;

    private Integer adminType;

    private String adminChina;

    private String adminSite;

    private String adminPwd;

    private String adminTEL;

    private String adminNotes;

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID == null ? null : adminID.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(Integer adminSex) {
        this.adminSex = adminSex;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public String getAdminChina() {
        return adminChina;
    }

    public void setAdminChina(String adminChina) {
        this.adminChina = adminChina == null ? null : adminChina.trim();
    }

    public String getAdminSite() {
        return adminSite;
    }

    public void setAdminSite(String adminSite) {
        this.adminSite = adminSite == null ? null : adminSite.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminTEL() {
        return adminTEL;
    }

    public void setAdminTEL(String adminTEL) {
        this.adminTEL = adminTEL == null ? null : adminTEL.trim();
    }

    public String getAdminNotes() {
        return adminNotes;
    }

    public void setAdminNotes(String adminNotes) {
        this.adminNotes = adminNotes == null ? null : adminNotes.trim();
    }
}