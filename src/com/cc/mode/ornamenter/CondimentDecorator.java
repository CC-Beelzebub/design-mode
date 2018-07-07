package com.cc.mode.ornamenter;

/**
 * @ClassName com.cc.mode.ornamenter
 * @Description:
 * 調料基類，抽象裝飾者
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public abstract  class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
