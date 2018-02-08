package com.ldq.imooc.spring.beanannotation.javabased;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/2/8
 * @modified by:
 */
public class DriverManager {

    public DriverManager(String url, String username, String password) {
        System.out.println("URL: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
