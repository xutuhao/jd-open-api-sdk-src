// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafWorkPage.java

package com.jd.open.api.sdk.response.workorder;

import java.io.Serializable;
import java.util.List;

public class SafWorkPage
        implements Serializable {

    public SafWorkPage() {
    }

    public void setResult(List result) {
        this.result = result;
    }

    public List getResult() {
        return result;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    private List result;
    private int totalCount;
}
