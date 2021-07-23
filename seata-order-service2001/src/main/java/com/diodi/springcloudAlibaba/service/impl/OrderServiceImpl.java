package com.diodi.springcloudAlibaba.service.impl;

import com.diodi.springcloudAlibaba.dao.OrderDao;
import com.diodi.springcloudAlibaba.domain.Order;
import com.diodi.springcloudAlibaba.service.AccountService;
import com.diodi.springcloudAlibaba.service.OrderService;
import com.diodi.springcloudAlibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author diodi
 * @create 2021-07-22-11:13
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    /**
     * 创建订单
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改状态
     * @param order
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void creat(Order order) {
        log.info("----->开始新建订单");
        orderDao.creat(order);
        log.info("----->订单微服务开始调用库存 ,扣减Count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->订单微服务开始调用账户余额 ,扣减Money");
        accountService.decrease(order.getUserId() , order.getMoney());
        //修改订单状态 从0->1 1代表已经完成
        log.info("----->开始更改订单状态");
        orderDao.update(order.getUserId() , 0);
        log.info("----->下订单结束了，O(∩_∩)O哈哈~");
    }
}
