package com.gis.gp.entity;

/**
 * Created by GIS on 2022/2/12.
 * 板块信息实体类
 */
public class BkInfo {
    public String getXH() {
        return XH;
    }

    public void setXH(String XH) {
        this.XH = XH;
    }

    public String getBKMC() {
        return BKMC;
    }

    public void setBKMC(String BKMC) {
        this.BKMC = BKMC;
    }

    public String getBKZF() {
        return BKZF;
    }

    public void setBKZF(String BKZF) {
        this.BKZF = BKZF;
    }

    public String getTJRQ() {
        return TJRQ;
    }

    public void setTJRQ(String TJRQ) {
        this.TJRQ = TJRQ;
    }

    private String XH;
    private String BKMC;
    private String BKZF;
    private String TJRQ;
}
