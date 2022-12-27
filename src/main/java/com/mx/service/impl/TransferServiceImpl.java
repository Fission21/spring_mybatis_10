package com.mx.service.impl;

import com.mx.dao.TransferDao;
import com.mx.service.LogService;
import com.mx.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferDao transferDao;

    //引入日志
    @Autowired
    private LogService logService;


    @Override
    public void transfer(String out, String in, Double money) {
        try {
            transferDao.outMoney(out, money);
            int i = 1 / 0; // 这会导致程序出现错误，注意 这里是用来测试 开启事务
            transferDao.inMoney(in, money);

        } finally {
            // 添加日志 通过 try finally 保证代码一定运行
            logService.log(out, in, money);
        }
    }
}
