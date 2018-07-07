package com.cc.mode.adapter;

/**
 * @ClassName com.cc.mode.adapter
 * @Description:
 * @Author chenjie
 * @Date Created in 星期五 2018/7/6
 * @Version 1.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
