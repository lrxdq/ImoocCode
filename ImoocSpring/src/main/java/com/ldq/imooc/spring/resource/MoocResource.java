package com.ldq.imooc.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
public class MoocResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {

//        Resource resouce = applicationContext.getResource("classpath:config.txt");
        Resource resouce = applicationContext.getResource("url:http://www.baidu.com");
        System.out.println(resouce.getFilename());
        System.out.println();
        System.out.println(resouce.contentLength());
        System.out.println();
    }
}
