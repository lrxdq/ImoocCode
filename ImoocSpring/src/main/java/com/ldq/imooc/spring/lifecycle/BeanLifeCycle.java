package com.ldq.imooc.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author:lidaoquan
 * @description:当使用配置文件或实现接口时，默认初始化和销毁方式不生效
 * @date: Created in 2018/1/29
 * @modified by:
 */
//public class BeanLifeCycle {
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    //1.配置文件中配置初始化和销毁方法
    public void start() {

        System.out.println("Bean start");
    }

    public void stop() {

        System.out.println("Bean stop");
    }


    //2.实现接口的初始化和销毁方法
    @Override
    public void destroy() throws Exception {

        System.out.println("Bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean afterPropertiesSet");
    }


    //3.默认全局的初始化和销毁方法
    public void defaultinit() {

        System.out.println("Bean defaultinit");
    }

    public void defaultdestroy() {

        System.out.println("Bean defaultdestroy");
    }
}