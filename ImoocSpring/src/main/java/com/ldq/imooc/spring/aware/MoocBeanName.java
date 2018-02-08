package com.ldq.imooc.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
public class MoocBeanName implements BeanNameAware,ApplicationContextAware{

    private String beanName;

    @Override
    public void setBeanName(String name) {

        this.beanName = name;
        System.out.println("MoocBeanName : "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("setApplicationContext : "+applicationContext.getBean(this.beanName).hashCode());
    }
}
