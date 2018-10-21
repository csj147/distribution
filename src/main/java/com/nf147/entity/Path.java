package com.nf147.entity;

public class Path {
    private String pathID;

    private String pathName;

    private String orderID;

    private String provinceID;

    private Long pathPrice;

    private String pathNotes;

    public String getPathID() {
        return pathID;
    }

    public void setPathID(String pathID) {
        this.pathID = pathID == null ? null : pathID.trim();
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID == null ? null : orderID.trim();
    }

    public String getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(String provinceID) {
        this.provinceID = provinceID == null ? null : provinceID.trim();
    }

    public Long getPathPrice() {
        return pathPrice;
    }

    public void setPathPrice(Long pathPrice) {
        this.pathPrice = pathPrice;
    }

    public String getPathNotes() {
        return pathNotes;
    }

    public void setPathNotes(String pathNotes) {
        this.pathNotes = pathNotes == null ? null : pathNotes.trim();
    }
}