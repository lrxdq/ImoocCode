package com.ldq.imooc.spring.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/30
 * @modified by:
 */
@Order(2)
@Component
public class BeanImplOne implements BeanInterface{
}
