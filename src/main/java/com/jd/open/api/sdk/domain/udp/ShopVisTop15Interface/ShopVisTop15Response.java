// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopVisTop15Response.java

package com.jd.open.api.sdk.domain.udp.ShopVisTop15Interface;

import java.io.Serializable;

public class ShopVisTop15Response
        implements Serializable {

    public ShopVisTop15Response() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProname() {
        return proname;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public Integer getRn() {
        return rn;
    }

    public void setSpuvisits(Integer spuvisits) {
        this.spuvisits = spuvisits;
    }

    public Integer getSpuvisits() {
        return spuvisits;
    }

    public void setSkuvisits(Integer skuvisits) {
        this.skuvisits = skuvisits;
    }

    public Integer getSkuvisits() {
        return skuvisits;
    }

    private Long wareId;
    private Long skuId;
    private String proname;
    private Integer rn;
    private Integer spuvisits;
    private Integer skuvisits;
}
