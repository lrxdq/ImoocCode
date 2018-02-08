package com.ldq.imooc.spring.ioc.injection.dao;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/25
 * @modified by:
 */
public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String arg) {

        System.out.println("保存数据"+arg);
    }
}
