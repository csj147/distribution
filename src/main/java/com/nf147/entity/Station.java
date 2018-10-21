package com.nf147.entity;

public class Station {
    private String stationID;

    private String stationName;

    private String provinceID;

    private String cityID;

    private String adminID;

    private String stationPhone;

    private String stationSite;

    private String stationNotes;

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID == null ? null : stationID.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(String provinceID) {
        this.provinceID = provinceID == null ? null : provinceID.trim();
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID == null ? null : cityID.trim();
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID == null ? null : adminID.trim();
    }

    public String getStationPhone() {
        return stationPhone;
    }

    public void setStationPhone(String stationPhone) {
        this.stationPhone = stationPhone == null ? null : stationPhone.trim();
    }

    public String getStationSite() {
        return stationSite;
    }

    public void setStationSite(String stationSite) {
        this.stationSite = stationSite == null ? null : stationSite.trim();
    }

    public String getStationNotes() {
        return stationNotes;
    }

    public void setStationNotes(String stationNotes) {
        this.stationNotes = stationNotes == null ? null : stationNotes.trim();
    }
}