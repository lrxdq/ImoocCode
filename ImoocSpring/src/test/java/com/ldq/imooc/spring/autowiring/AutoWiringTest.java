package com.ldq.imooc.spring.autowiring;

import com.ldq.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends UnitTestBase{

    public AutoWiringTest() {

        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void test(){
        AutoWiringService autoWiringService = getBean("autoWiringService");
        autoWiringService.say("That is test");
    }
}