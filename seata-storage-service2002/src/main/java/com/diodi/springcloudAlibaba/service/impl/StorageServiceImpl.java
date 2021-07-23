package com.diodi.springcloudAlibaba.service.impl;

import com.diodi.springcloudAlibaba.dao.StorageDao;
import com.diodi.springcloudAlibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author diodi
 * @create 2021-07-22-16:32
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    StorageDao storageDao;
    @Override
    public void decrease(Long productId , Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }
}
