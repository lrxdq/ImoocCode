package com.ldq.imooc.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/2/8
 * @modified by:
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Store getStringStore() {
        return new StringStore();
    }
//    @Value("${url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${password}")
//    private String password;
//
//    @Bean
//    public DriverManager driverManager() {
//        return new DriverManager(url, username, password);
//    }
//
//    @Bean(name = "store", initMethod = "init", destroyMethod = "destroy")
//    public Store getStringStore() {
//        return new StringStore();
//    }
}
