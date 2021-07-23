package com.diodi.springcloudAlibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给页面的结果
 * @author diodi
 * @create 2021-07-22-10:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;
    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
