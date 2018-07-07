package com.cc.mode.template;

import sun.util.resources.cldr.fi.CalendarData_fi_FI;

/**
 * @ClassName com.cc.mode.template
 * @Description:
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public class Tes extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the Tes");
    }

    @Override
    void addCondiments() {
        System.out.println("Tes Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        return false;
    }
}
