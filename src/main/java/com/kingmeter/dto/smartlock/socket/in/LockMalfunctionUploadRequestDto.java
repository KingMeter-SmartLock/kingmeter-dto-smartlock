package com.kingmeter.dto.smartlock.socket.in;

import lombok.Data;

@Data
public class LockMalfunctionUploadRequestDto {
    private String soc;//智能锁电池容量
    private String boc;//电动车电池容量
    private String flk;//智能锁故障
    private String flc;//电动车控制器故障
    private String flb;//电动车电池故障

    public LockMalfunctionUploadRequestDto(){}

    public LockMalfunctionUploadRequestDto(String[] array){
        this.soc = array[0];
        this.boc = array[1];
        this.flk = array[2];
        this.flc = array[3];
        this.flb = array[4];
    }

}
