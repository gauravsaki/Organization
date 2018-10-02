package com.orgnization.sw.pojo;

import java.util.Date;

public class Order {
    private int ordId;
    private Date time;
    private int cusId;
    private int proId;


    public int getOrdId() {
        return ordId;
    }

    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("ordId=").append(ordId);
        sb.append(", time=").append(time);
        sb.append(", cusId=").append(cusId);
        sb.append(", proId=").append(proId);
        sb.append('}');
        return sb.toString();
    }
}
