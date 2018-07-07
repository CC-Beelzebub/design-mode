package com.cc.mode.adapter;

/**
 * @ClassName com.cc.mode.adapter
 * @Description: 火鸡适配器，需要实现适配的目标接口
 * @Author chenjie
 * @Date Created in 星期五 2018/7/6
 * @Version 1.0
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
