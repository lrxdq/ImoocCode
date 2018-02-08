package com.ldq.imooc.spring.beanannotation;

import com.ldq.imooc.base.UnitTestBase;
import com.ldq.imooc.spring.beanannotation.injection.service.InjectionService;
import com.ldq.imooc.spring.beanannotation.multibean.BeanInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/30
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationTest extends UnitTestBase {

    public BeanAnnotationTest() {

        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void test() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("This is test");
    }

    @Test
    public void testAutowired() {
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("This is testAutowired");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }
}