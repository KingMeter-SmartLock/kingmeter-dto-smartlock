package com.kingmeter.dto.smartlock.socket.in;

import com.kingmeter.dto.smartlock.utils.GpsUtils;
import lombok.Data;

@Data
public class LockHeartBeatRequestDto {

    private long lockId;//id
    private double lon;//longitude
    private double lat;//latitude
    private String alm;//alarm
    private String stu;//status of this lock : 1,open ;2 ,closed ;3 ,malfunction

    public LockHeartBeatRequestDto(){}

    public LockHeartBeatRequestDto(String[] array){
//        this.lon = array[0];
//        this.lat = array[1];

        this.lon = GpsUtils.getInstance().calculateGps(array[0]);
        this.lat = GpsUtils.getInstance().calculateGps(array[1]);

        this.alm = array[2];
        this.stu = array[3];
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("E12059.71961").append(",").append("N2446.79096").append(",").append(this.alm).append(",").append(this.stu).append(",");
        return sb.toString();
    }
}
