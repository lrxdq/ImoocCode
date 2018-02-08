package com.ldq.imooc.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
public class MoocApplicationContext implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("MoocApplicationContext : "+applicationContext.getBean("moocApplicationContext").hashCode());
    }
}
