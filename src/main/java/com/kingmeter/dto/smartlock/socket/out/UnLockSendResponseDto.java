package com.kingmeter.dto.smartlock.socket.out;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class UnLockSendResponseDto {
    private String uid;//后台的用户编号
    private String cid;//用户卡卡号，没有为空

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if (!StringUtils.isEmpty(uid)) {
            sb.append(Integer.toHexString(Integer.parseInt(uid)));
        } else {
            sb.append(0);
        }

        sb.append(",")
                .append(cid).append(",");
        return sb.toString();
    }

    public UnLockSendResponseDto() {
    }

    public UnLockSendResponseDto(String array[]) {
        this.uid = array[0];
        this.cid = array[1];
    }

    public UnLockSendResponseDto(String userId, String card) {
        this.uid = userId;
        this.cid = card;
    }
}
