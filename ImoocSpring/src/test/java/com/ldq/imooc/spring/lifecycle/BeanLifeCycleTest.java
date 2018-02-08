package com.ldq.imooc.spring.lifecycle;

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
public class BeanLifeCycleTest extends UnitTestBase{

    public BeanLifeCycleTest() {

        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void test() {

        super.getBean("beanLifeCycle");
    }
}