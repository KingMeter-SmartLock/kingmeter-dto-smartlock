package com.kingmeter.dto.smartlock.socket.out;

import lombok.Data;

@Data
public class LockLoginResponseDto {
    private byte[] token;

    private String sls;//执行结果
    private String uid;//后台的用户编号
    private String cid;//用户卡号
    private String csn;//运营商编号

    private String otherCard1 = "";
    private String otherCard2 = "";
    private String otherCard3 = "";
    private String otherCard4 = "";

    public String toString(float sfv) {
        StringBuffer sb = new StringBuffer();
        sb.append(this.sls).append(",").append(this.uid).append(",").append(this.cid).append(",").append(this.csn).append(",").append(this.otherCard1).append(",").append(this.otherCard2).append(",").append(this.otherCard3).append(",").append(this.otherCard4).append(",");
        return sb.toString();
    }

    public LockLoginResponseDto() {
    }

    public LockLoginResponseDto(String[] array) {
        this.sls = array[0];
        this.uid = array[1];
        this.cid = array[2];
        this.csn = array[3];
        this.otherCard1 = array[4];
        this.otherCard2 = array[5];
        this.otherCard3 = array[6];
        this.otherCard4 = array[7];
    }
}
