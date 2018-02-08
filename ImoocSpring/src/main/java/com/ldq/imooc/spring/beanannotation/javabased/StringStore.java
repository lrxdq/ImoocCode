package com.ldq.imooc.spring.beanannotation.javabased;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/2/8
 * @modified by:
 */
public class StringStore implements Store<String> {

    public void init() {
        System.out.println("stroe init");
    }

    public void destroy() {
        System.out.println("stroe destroy");
    }
}
