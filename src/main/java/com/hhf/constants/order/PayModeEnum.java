package com.hhf.constants.order;

import java.io.Serializable;

/**
 * Created with Liu Yong
 * User: melnnyy
 * Date: 2014/7/4
 * Time: 14:56
 */
public enum PayModeEnum implements Serializable, Comparable<PayModeEnum> {
    PAY_MODE_00("00", "货到付款-现金", "00")
    ,PAY_MODE_01("01", "货到付款-POS刷卡", "01")
    ,PAY_MODE_10("10", "银联-中国工商银行", "0005")
    ,PAY_MODE_11("11", "银联-中国农业银行", "4008")
    ,PAY_MODE_12("12", "银联-中国银行", "1023")
    ,PAY_MODE_13("13", "银联-中国建设银行", "1010")
    ,PAY_MODE_14("14", "银联-交通银行", "1025")
    ,PAY_MODE_15("15", "银联-招商银行", "0007")
    ,PAY_MODE_16("16", "银联-光大银行", "0027")
    ,PAY_MODE_17("17", "银联-中信网银", "0004")
    ,PAY_MODE_18("18", "银联-民生银行(非签约)", "0015")
    ,PAY_MODE_1c("1c", "银联-浦东发展银行", "1022")
    ,PAY_MODE_1a("1a", "银联-华夏银行", "1021")
    ,PAY_MODE_1b("1b", "银联-广东发展银行", "0026")
    ,PAY_MODE_1d("1d", "银联-兴业银行", "0009")
    ,PAY_MODE_1e("1e", "银联-中国邮政储蓄银行", "0028")
    ,PAY_MODE_1f("1f", "银联-东亚银行", "0051")
    ,PAY_MODE_20("20", "支付宝", "20")
    ,PAY_MODE_30("30", "吉林银行", "30")
    ;

    private final String value;
    private final String desc;
    private final String gateId;

    PayModeEnum(String value, String desc, String gateId) {
        this.value = value;
        this.desc = desc;
        this.gateId = gateId;
    }

    // -------------------------------------------------------------

    public static PayModeEnum get(String value) {
        if(null == value) return null;

        value = value.trim();
        if(0 == value.length()) return null;

        PayModeEnum payModeEnum = null;
        for(PayModeEnum o : PayModeEnum.values()) {
            if(!value.equals(o.getValue())) continue;
            payModeEnum = o;
            break;
        }

        return payModeEnum;
    }

    public static PayModeEnum getByGateId(String gateId) {
        if(null == gateId) return null;

        gateId = gateId.trim();
        if(0 == gateId.length()) return null;

        PayModeEnum payModeEnum = null;
        for(PayModeEnum o : PayModeEnum.values()) {
            if(!gateId.equals(o.getGateId())) continue;
            payModeEnum = o;
            break;
        }

        return payModeEnum;
    }

    // -------------------------------------------------------------

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public String getGateId() {
        return gateId;
    }
}
