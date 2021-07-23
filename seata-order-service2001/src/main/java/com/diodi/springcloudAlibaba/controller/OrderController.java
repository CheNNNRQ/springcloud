package com.diodi.springcloudAlibaba.controller;

import com.diodi.springcloudAlibaba.domain.CommonResult;
import com.diodi.springcloudAlibaba.domain.Order;
import com.diodi.springcloudAlibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author diodi
 * @create 2021-07-22-12:10
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @GetMapping(value = "/order/creat")
    public CommonResult creat(Order order){
        orderService.creat(order);
        return new CommonResult(200, "订单创建成功");
    }
}
