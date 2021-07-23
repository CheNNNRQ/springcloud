package com.diodi.springcloudAlibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author diodi
 * @create 2021-07-22-16:12
 */
@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
