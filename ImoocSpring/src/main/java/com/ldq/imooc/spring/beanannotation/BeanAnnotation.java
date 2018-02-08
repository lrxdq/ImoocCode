package com.ldq.imooc.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/30
 * @modified by:
 */
@Scope("pro")
@Component
public class BeanAnnotation {

    public void say(String arg) {

        System.out.println("BeanAnnotation : " + arg);
    }
}
