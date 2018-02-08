package com.ldq.imooc.spring.resource;

import com.ldq.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class MoocResourceTest extends UnitTestBase{

    public MoocResourceTest(){

        super("classpath:spring-resource.xml");
    }

    @Test
    public void test() throws IOException {

        MoocResource moocResource = super.getBean("moocResource");
        moocResource.resource();
    }
}