package com.kingmeter.dto.smartlock.socket.in;


import lombok.Data;

@Data
public class SetCertForLockRequestDto {
    private long lockId;
    private int sls;
    public SetCertForLockRequestDto(String[] array){
        this.lockId = Long.parseLong(array[0]);
        this.sls = Integer.parseInt(array[1]);
    }
}
