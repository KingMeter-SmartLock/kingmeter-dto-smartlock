package com.kingmeter.dto.smartlock.socket.in;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class UnLockSendRequestDto {
    private String stu;//锁状态 1 开；2 关；3 故障
    private String uid;//用户编号

    public UnLockSendRequestDto(){}

    public UnLockSendRequestDto(String[] array){
        this.stu = array[0];

        if (!StringUtils.isEmpty(array[1])) {
            this.uid = String.valueOf(Long.parseLong(array[1], 16));
        }else{
            this.uid = "";
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.stu).append(",").append(this.uid).append(",");
        return sb.toString();
    }
}
