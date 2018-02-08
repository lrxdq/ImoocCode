package com.ldq.imooc.spring.aware;

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
public class MoocBeanNameTest extends UnitTestBase{

    public MoocBeanNameTest() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void test() {
        System.out.println("MoocBeanNameTest : "+super.getBean("moocBeanName").hashCode());
    }
}