package com.cc.mode.template;

/**
 * @ClassName com.cc.mode.template
 * @Description:
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee Adding Suger and Milk");
    }
}
