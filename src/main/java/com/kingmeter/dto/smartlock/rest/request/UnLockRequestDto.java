package com.kingmeter.dto.smartlock.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UnLockRequestDto {
    private String lockCode;
}
