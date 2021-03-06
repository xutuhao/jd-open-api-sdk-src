// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareListSearchRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareListSearchRequest extends AbstractRequest
        implements JdRequest {

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public String getShopCateGoryId() {
        return shopCateGoryId;
    }

    public void setShopCateGoryId(String shopCateGoryId) {
        this.shopCateGoryId = shopCateGoryId;
    }

    public WareListSearchRequest() {
    }

    public String getApiMethod() {
        return "jingdong.wares.list.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("title", title);
        pmap.put("page", page);
        pmap.put("cid", cid);
        pmap.put("page_size", pageSize);
        pmap.put("start_price", startPrice);
        pmap.put("end_price", endPrice);
        pmap.put("fields", fields);
        pmap.put("start_time", startTime);
        pmap.put("end_time", endTime);
        pmap.put("ware_status", wareStatus);
        pmap.put("ware_status", wareStatus);
        pmap.put("start_modified", startModified);
        pmap.put("end_modified", endModified);
        pmap.put("item_num", itemNum);
        pmap.put("shop_cateGoryId", shopCateGoryId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareListSearchResponse.class;
    }

    public String getStartModified() {
        return startModified;
    }

    public void setStartModified(String startModified) {
        this.startModified = startModified;
    }

    public String getEndModified() {
        return endModified;
    }

    public void setEndModified(String endModified) {
        this.endModified = endModified;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getWareStatus() {
        return wareStatus;
    }

    public void setWareStatus(String wareStatus) {
        this.wareStatus = wareStatus;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String cid;
    private String startPrice;
    private String endPrice;
    private String page;
    private String pageSize;
    private String title;
    private String startTime;
    private String endTime;
    private String startModified;
    private String endModified;
    private String wareStatus;
    private String fields;
    private String itemNum;
    private String shopCateGoryId;
}
