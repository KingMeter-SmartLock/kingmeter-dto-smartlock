package com.kingmeter.dto.smartlock.rest.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SettingCardListRequestDto {
    private long lockId;
    private int userId;
    private String cid="";//用户卡号
    private String otherCard1="";
    private String otherCard2="";
    private String otherCard3="";
    private String otherCard4="";
}
