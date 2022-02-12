package com.gis.gp.entity;

/**
 * Created by GIS on 2022/2/12.
 * 距离上次领跑相隔天数信息
 */
public class BkDayInfo {
    public String getBkmc() {
        return bkmc;
    }

    public void setBkmc(String bkmc) {
        this.bkmc = bkmc;
    }

    public String getMaxtjrq() {
        return maxtjrq;
    }

    public void setMaxtjrq(String maxtjrq) {
        this.maxtjrq = maxtjrq;
    }

    public String getDeltadays() {
        return deltadays;
    }

    public void setDeltadays(String deltadays) {
        this.deltadays = deltadays;
    }

    private String bkmc;
    private String maxtjrq;
    private String deltadays;
}
