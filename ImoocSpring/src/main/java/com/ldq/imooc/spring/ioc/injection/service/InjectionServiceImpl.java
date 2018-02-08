package com.ldq.imooc.spring.ioc.injection.service;

import com.ldq.imooc.spring.ioc.injection.dao.InjectionDAO;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/25
 * @modified by:
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {

        this.injectionDAO = injectionDAO;
    }

    //设值注入
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
