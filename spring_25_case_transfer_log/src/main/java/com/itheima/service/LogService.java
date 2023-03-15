package com.itheima.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    //propagation设置事务属性：传播行为设置为当前操作需要新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    //为了在转账出错时，依然记录在日志里面
    //@Transactional
    void log(String out, String in, Integer money);
}
