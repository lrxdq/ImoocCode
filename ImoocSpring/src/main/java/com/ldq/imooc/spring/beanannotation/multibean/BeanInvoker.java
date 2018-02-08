package com.ldq.imooc.spring.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/30
 * @modified by:
 */
@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface beanInterface;

    public void say() {

        if (null != list && list.size() != 0) {

            System.out.println("list is : ");
            for (BeanInterface bean : list) {

                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> list is null ");
        }

        if (map != null && map.size() != 0) {

            System.out.println("map is : ");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null ");
        }
        System.out.println();
        if (beanInterface != null) {
            System.out.println(beanInterface.getClass().getName());
        }
    }
}
