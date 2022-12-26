package com.mx.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    // Transactional 是开启事务，propagation = Propagation.REQUIRES_NEW 是创搭建一个新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out,String in, Double money);
}
