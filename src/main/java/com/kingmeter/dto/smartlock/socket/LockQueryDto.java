package com.kingmeter.dto.smartlock.socket;

import lombok.Data;

@Data
public class LockQueryDto {
    private long id;//智能锁编号
    private int type;//1gprs锁，2蓝牙锁 参照 GprsLockType
    private int status;//锁的状态，0 正常，1，故障。

    private long bikeId;//所属车辆的id，如果没有则为空

    private String companyCode;
    private String startDate;//查询注册起始时间
    private String endDate;//查询注册截止时间

    private int pageNo;
}
