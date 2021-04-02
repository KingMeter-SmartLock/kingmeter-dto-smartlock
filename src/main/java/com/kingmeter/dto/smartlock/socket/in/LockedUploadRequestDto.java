package com.kingmeter.dto.smartlock.socket.in;

import lombok.Data;

@Data
public class LockedUploadRequestDto {
    private String time;//时间
    private String uid;//用户编号，原样返回服务器开锁下发传过来的用户编号

    private long lockId;
    private double longitude;
    private double latitude;

    public LockedUploadRequestDto(){}
    public LockedUploadRequestDto(String[] array){
        this.time = array[0];
        this.uid = array[1];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.time).append(",").append(this.uid).append(",");
        return sb.toString();
    }
}
