// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaichePopGetResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            PopDetailJos

public class KuaichePopGetResponse extends AbstractResponse {

    public KuaichePopGetResponse() {
    }

    public void setResult(PopDetailJos result) {
        this.result = result;
    }

    public PopDetailJos getResult() {
        return result;
    }

    private PopDetailJos result;
}
