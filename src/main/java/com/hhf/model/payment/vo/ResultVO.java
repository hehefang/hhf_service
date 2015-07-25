package com.hhf.model.payment.vo;

import java.io.Serializable;

public class ResultVO implements Serializable {
    private boolean result;
    private String info;

    public ResultVO(boolean result, String info) {
        this.result = result;
        this.info = info;
    }

    public static ResultVO getSuccess(String info) {
        return new ResultVO(true, info);
    }

    public static ResultVO getSuccess() {
        return getSuccess("操作成功！");
    }

    public static ResultVO getFailure(String info) {
        return new ResultVO(false, info);
    }

    public static ResultVO getFailure() {
        return getFailure("操作失败！");
    }

    public String getJson() {
        return "{\"result\":\"" + (result ? 1 : 0) + "\", \"info\":\"" + info + "\"}";
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
