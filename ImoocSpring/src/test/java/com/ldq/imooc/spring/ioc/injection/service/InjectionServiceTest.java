package com.ldq.imooc.spring.ioc.injection.service;

import com.ldq.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/25
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionServiceTest extends UnitTestBase {

    public InjectionServiceTest() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSetter() {

        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("需要保存的数据");
    }


    @Test
    public void testConstructor() {

        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("需要保存的数据");
    }
}