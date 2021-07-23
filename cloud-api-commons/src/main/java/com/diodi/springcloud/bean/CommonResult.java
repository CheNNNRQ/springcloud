package com.diodi.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author diodi
 * @create 2021-06-26-16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 类似于404这样的编码
     */
    private Integer code;
    /**
     * 错误的信息
     */
    private String message;
    /**
     * 通用的返回类 返回泛型参数
     */
    private T data;
    /**
     * data为null时
     */
    public CommonResult(Integer code , String message){
        this(code,message,null);
    }
}
