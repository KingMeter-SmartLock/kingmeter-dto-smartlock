package com.kingmeter.dto.smartlock.socket.out;

import lombok.Data;

@Data
public class LockMalfunctionUploadResponseDto {
    private String sls;//执行结果

    @Override
    public String toString() {
        return sls+",";
    }
}
