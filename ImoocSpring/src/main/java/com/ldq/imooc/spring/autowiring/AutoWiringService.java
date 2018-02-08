package com.ldq.imooc.spring.autowiring;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/29
 * @modified by:
 */
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setAutoWiringDAO");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }
}
