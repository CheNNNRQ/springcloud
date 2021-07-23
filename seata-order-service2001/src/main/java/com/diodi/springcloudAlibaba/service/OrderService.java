package com.diodi.springcloudAlibaba.service;

import com.diodi.springcloudAlibaba.domain.Order;

/**
 * 订单
 * @author diodi
 * @create 2021-07-22-11:08
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void creat(Order order);
}
