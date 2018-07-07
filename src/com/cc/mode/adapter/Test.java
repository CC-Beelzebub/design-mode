package com.cc.mode.adapter;

/**
 * @ClassName com.cc.mode.adapter
 * @Description: 使用适配器模式-用火鸡代替鸭子
 * @Author chenjie
 * @Date Created in 星期五 2018/7/6
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
