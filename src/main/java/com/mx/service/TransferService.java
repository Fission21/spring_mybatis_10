package com.mx.service;

import org.springframework.transaction.annotation.Transactional;

public interface TransferService {
    /**
     *
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */

    // 1,开启事务
    @Transactional
    public void transfer(String out, String in, Double money);
}
