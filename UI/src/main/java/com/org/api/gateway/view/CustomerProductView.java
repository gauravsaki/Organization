package com.org.api.gateway.view;

public class CustomerProductView {
    private String cusName;
    private String proName;
    private float prdPrice;
    private String cusPincode;

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public float getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(float prdPrice) {
        this.prdPrice = prdPrice;
    }

    public String getCusPincode() {
        return cusPincode;
    }

    public void setCusPincode(String cusPincode) {
        this.cusPincode = cusPincode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerProductView{");
        sb.append("cusName='").append(cusName).append('\'');
        sb.append(", proName='").append(proName).append('\'');
        sb.append(", prdPrice='").append(prdPrice).append('\'');
        sb.append(", cusPincode='").append(cusPincode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
