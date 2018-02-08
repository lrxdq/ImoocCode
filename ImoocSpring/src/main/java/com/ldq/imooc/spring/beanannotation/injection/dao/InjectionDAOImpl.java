package com.ldq.imooc.spring.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/25
 * @modified by:
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String arg) {

        System.out.println("保存数据"+arg);
    }
}
