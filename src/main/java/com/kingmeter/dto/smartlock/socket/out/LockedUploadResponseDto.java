package com.kingmeter.dto.smartlock.socket.out;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class LockedUploadResponseDto {
    private String sls;//执行结果


    public LockedUploadResponseDto(String[] array){
        this.sls = array[0];
    }

    @Override
    public String toString() {
        return sls+",";
    }
}
