package com.ldq.imooc.spring.bean;

import com.ldq.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase{

    public BeanScopeTest() {
        super("classpath:spring-beanscope.xml");
    }

    @Test
    public void testSay(){

        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        // bean的作用域验证
        //singleton:单例，指一个bean容器中只存在一份
        //prototype:每次请求创建新的实例，destory方式不生效
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}