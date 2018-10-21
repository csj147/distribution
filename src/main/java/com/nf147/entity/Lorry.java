package com.nf147.entity;

import java.util.Date;

public class Lorry {
    private String lorryID;

    private String lorryModel;

    private String lorryCO;

    private String pathID;

    private Date lorryYield;

    private Date lorryBuy;

    private String yieldNotes;

    public String getLorryID() {
        return lorryID;
    }

    public void setLorryID(String lorryID) {
        this.lorryID = lorryID == null ? null : lorryID.trim();
    }

    public String getLorryModel() {
        return lorryModel;
    }

    public void setLorryModel(String lorryModel) {
        this.lorryModel = lorryModel == null ? null : lorryModel.trim();
    }

    public String getLorryCO() {
        return lorryCO;
    }

    public void setLorryCO(String lorryCO) {
        this.lorryCO = lorryCO == null ? null : lorryCO.trim();
    }

    public String getPathID() {
        return pathID;
    }

    public void setPathID(String pathID) {
        this.pathID = pathID == null ? null : pathID.trim();
    }

    public Date getLorryYield() {
        return lorryYield;
    }

    public void setLorryYield(Date lorryYield) {
        this.lorryYield = lorryYield;
    }

    public Date getLorryBuy() {
        return lorryBuy;
    }

    public void setLorryBuy(Date lorryBuy) {
        this.lorryBuy = lorryBuy;
    }

    public String getYieldNotes() {
        return yieldNotes;
    }

    public void setYieldNotes(String yieldNotes) {
        this.yieldNotes = yieldNotes == null ? null : yieldNotes.trim();
    }
}