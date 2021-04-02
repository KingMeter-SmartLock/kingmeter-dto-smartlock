package com.kingmeter.dto.smartlock.socket;

import lombok.Data;

import java.util.Date;

/**
 * 锁信息
 */
@Data
public class LockInfoDto {
    private long id;//智能锁编号
    private int type;//1gprs锁，2蓝牙锁 参照 GprsLockType
    private String mac;//锁的mac地址
    private long bikeId;//所属车辆的id，如果没有则为空

    private double longitude;//经度
    private double latitude;//纬度

    private int status;//锁的状态，0 正常，1，故障。
    private int isopen;//锁的开关状态，0 开锁，1 关锁

    private long openTotalTimes;//开锁次数
    private long closeTotalTimes;//关锁次数

    private String companyCode;
    private String companyName;//公司名称

    private Date createDate;//创建时间
    private Date updateDate;//最新修改时间

    private long pile_id;//pile id  .

    private long site_id;//site id .
}
