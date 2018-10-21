package com.nf147.entity;

public class Scope {
    private String scopeID;

    private String scopeName;

    private Long scopePrice;

    private String stationID;

    private String scopeNotes;

    public String getScopeID() {
        return scopeID;
    }

    public void setScopeID(String scopeID) {
        this.scopeID = scopeID == null ? null : scopeID.trim();
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName == null ? null : scopeName.trim();
    }

    public Long getScopePrice() {
        return scopePrice;
    }

    public void setScopePrice(Long scopePrice) {
        this.scopePrice = scopePrice;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID == null ? null : stationID.trim();
    }

    public String getScopeNotes() {
        return scopeNotes;
    }

    public void setScopeNotes(String scopeNotes) {
        this.scopeNotes = scopeNotes == null ? null : scopeNotes.trim();
    }
}