package com.ldq.imooc.spring.bean;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
public class BeanScope {

    public void say() {

        System.out.println("Beanscope say : " + this.hashCode());
    }
}
