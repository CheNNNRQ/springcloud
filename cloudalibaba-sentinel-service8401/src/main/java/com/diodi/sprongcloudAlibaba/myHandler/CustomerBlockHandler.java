package com.diodi.sprongcloudAlibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.diodi.springcloud.bean.CommonResult;

/**
 * @author diodi
 * @create 2021-07-20-21:55
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
