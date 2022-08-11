package com.kingmeter.dto.smartlock.socket.in;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SetCertForLockRequestDto {
    private long lockId;
    private int sls;
    public SetCertForLockRequestDto(String[] array){
        this.lockId = Long.parseLong(array[0]);
        this.sls = Integer.parseInt(array[1]);
    }
}
