package com.kingmeter.dto.smartlock.socket.in;

import lombok.Data;

@Data
public class LockLoginRequestDto {
    private long lockId;//智能锁id和responseBody里面的lockid一致
    private String bid;//车辆id
    private String pwd;//密码，六位
    private float hdv;//硬件版本，四位
    private float sfv;//软件版本，四位
    private String icd;//SIM卡得ICCID
    private String sls;//执行结果，0 初始登录，3，运营商编号错误

    public LockLoginRequestDto(){}

    public LockLoginRequestDto(String[] array){
        this.lockId = Long.parseLong(array[0]);
        this.bid = array[1];
        this.pwd = array[2];
        this.hdv = Float.parseFloat(array[3].substring(1))/10;
        this.sfv = Float.parseFloat(array[4].substring(1))/10;
        this.icd = array[5];
        this.sls = array[6];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.lockId).append(",").append(this.bid).append(",").append(this.pwd).append(",H").append(this.hdv*10).append(",S").append(this.sfv*10).append(",").append(this.icd).append(",").append(this.sls).append(",");
        return sb.toString();
    }
}
