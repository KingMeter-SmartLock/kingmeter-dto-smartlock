package com.kingmeter.dto.smartlock.socket.in;


import com.kingmeter.dto.smartlock.utils.GpsUtils;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class LockQueryRequestDto {
    private long lockId;//智能锁主键id
    private String bikeId;//车辆id
    private float hdv;//硬件版本，四位
    private float sfv;//软件版本，四位

    private double lon;//经度
    private double lat;//纬度
    private String alm;//报警
    private String stu;//锁状态 1 开；2 关；3 故障

    private String soc;//智能锁电池容量
    private String boc;//电动车电池容量
    private String flk;//智能锁故障
    private String flc;//电动车控制器故障
    private String flb;//电动车电池故障



    public LockQueryRequestDto(String[] array){
        this.lockId = Long.parseLong(array[0]);
        this.bikeId = array[1];
//        this.hdv = array[2];
//        this.sfv = array[3];

        this.hdv = Float.parseFloat(array[2].substring(1))/10;
        this.sfv = Float.parseFloat(array[3].substring(1))/10;

        if(array.length>4){

            this.lon = GpsUtils.getInstance().calculateGps(array[4]);
            this.lat = GpsUtils.getInstance().calculateGps(array[5]);

            this.alm = array[6];
            this.stu = array[7];

            this.soc = array[8];
            this.boc = array[9];
            this.flk = array[10];
            this.flc = array[11];
            this.flb = array[12];
        }


    }
}
