package com.gis.gp.entity;

/**
 * Created by GIS on 2022/2/12.
 * 距离上次领跑相隔天数信息
 * a.bkmc,a.maxtjrq as pretjrq,b.maxtjrq, b.maxtjrq - a.maxtjrq as pretwodelta,b.deltadays
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
    private String pretjrq;

    public String getPretjrq() {
        return pretjrq;
    }

    public void setPretjrq(String pretjrq) {
        this.pretjrq = pretjrq;
    }

    public String getPretwodelta() {
        return pretwodelta;
    }

    public void setPretwodelta(String pretwodelta) {
        this.pretwodelta = pretwodelta;
    }

    private String pretwodelta;
    private String maxtjrq;
    private String deltadays;

    public String getMybkmc() {
        return mybkmc;
    }

    public void setMybkmc(String mybkmc) {
        this.mybkmc = mybkmc;
    }

    private String mybkmc;
}
