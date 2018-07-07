package com.cc.mode.strategy;

/**
 * @ClassName com.cc.mode.strategy
 * @Description:
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        //动态设置行为
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performQuack();
        mallardDuck.performFly();


    }
}
