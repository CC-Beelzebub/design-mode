package com.cc.mode.strategy;

/**
 * @ClassName com.cc.mode.strategy
 * @Description:
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flyNoWay");
    }
}
