package com.ldq.imooc.spring.beanannotation.javabased;

import com.ldq.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/2/8
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class StoreConfigTest extends UnitTestBase {

    public StoreConfigTest() {

        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testScope() {

        Store scope1 = super.getBean("stringStore");
        System.out.println(scope1.hashCode());

        Store scope2 = super.getBean("stringStore");
        System.out.println(scope2.hashCode());
    }

    @Test
    public void test() {

        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testDriverManager() {

        DriverManager driverManager = super.getBean("driverManager");
        System.out.println(driverManager.getClass().getName());
    }
}