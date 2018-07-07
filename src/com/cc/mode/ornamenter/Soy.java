package com.cc.mode.ornamenter;

/**
 * @ClassName com.cc.mode.ornamenter
 * @Description: 調料 ，具體裝飾者
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .4 + beverage.cost();
    }
}
