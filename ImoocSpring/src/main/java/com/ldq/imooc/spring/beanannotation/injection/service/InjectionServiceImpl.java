package com.ldq.imooc.spring.beanannotation.injection.service;

import com.ldq.imooc.spring.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/25
 * @modified by:
 */
@Service
public class InjectionServiceImpl implements InjectionService {

    @Autowired
    //成员变量
    private InjectionDAO injectionDAO;

    //构造器
    public InjectionServiceImpl(InjectionDAO injectionDAO) {

        this.injectionDAO = injectionDAO;
    }

    //设值setter
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {

        System.out.println("Service接收参数" + arg);
        arg = arg + ":" + arg.hashCode();
        injectionDAO.save(arg);
    }
}
