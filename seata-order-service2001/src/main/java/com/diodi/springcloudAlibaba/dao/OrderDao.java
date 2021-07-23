package com.diodi.springcloudAlibaba.dao;

import com.diodi.springcloudAlibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * dao接口 提供新建订单和改变订单状态
 * @author diodi
 * @create 2021-07-22-10:38
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     * @param order 订单
     */
    void creat(Order order);

    /**
     * 修改订单状态 从0改为1
     * @param userId 订单编号
     * @param status 订单状态
     */
    void update(@Param("userId") Long userId ,@Param("status") Integer status);
}
