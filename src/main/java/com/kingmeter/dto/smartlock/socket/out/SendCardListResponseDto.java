package com.kingmeter.dto.smartlock.socket.out;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.StringUtils;

@AllArgsConstructor
@Data
public class SendCardListResponseDto {
    private String uid;//后台的用户编号
    private String cid;//用户卡卡号，没有为空
    private String cardNo1;//用户卡卡号，没有为空
    private String cardNo2;//用户卡卡号，没有为空
    private String cardNo3;//用户卡卡号，没有为空
    private String cardNo4;//用户卡卡号，没有为空

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if (!StringUtils.isEmpty(uid)) {
            sb.append(Integer.toHexString(Integer.parseInt(uid)));
        } else {
            sb.append(0);
        }
        sb.append(",")
                .append(cid).append(",")
                .append(cardNo1).append(",")
                .append(cardNo2).append(",")
                .append(cardNo3).append(",")
                .append(cardNo4).append(",");
        return sb.toString();
    }
}
