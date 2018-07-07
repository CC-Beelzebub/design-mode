package com.cc.mode.adapter;

/**
 * @ClassName com.cc.mode.adapter
 * @Description:
 * @Author chenjie
 * @Date Created in 星期五 2018/7/6
 * @Version 1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }
}
