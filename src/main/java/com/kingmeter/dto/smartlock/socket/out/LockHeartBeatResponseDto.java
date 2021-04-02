package com.kingmeter.dto.smartlock.socket.out;

import lombok.Data;

@Data
public class LockHeartBeatResponseDto {
    private String sls;//执行结果

    @Override
    public String toString() {
        return sls+",";
    }

    public LockHeartBeatResponseDto(){}
    public LockHeartBeatResponseDto(String[] array){
        this.sls = array[0];
    }
}
