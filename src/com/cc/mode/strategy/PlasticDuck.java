package com.cc.mode.strategy;

/**
 * @ClassName com.cc.mode.strategy
 * @Description:
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class PlasticDuck extends Duck {
    public PlasticDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am PlasticDuck");
    }
}
