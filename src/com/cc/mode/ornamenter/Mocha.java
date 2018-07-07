package com.cc.mode.ornamenter;

/**
 * @ClassName com.cc.mode.ornamenter
 * @Description: 調料：摩卡，具體裝飾者，應為是一個裝飾者，所以擴展自CondimentDecorator
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /*
     * @description:
     我们希望叙述不只是描述饮料（例
     如“DarkRoast”），而是完整地连调料都
     描述出来（例如“DarkRoast, Mocha”）。
     所以首先利用委托的做法，得到一个
     叙述，然后在其后加上附加的叙述（例
     如“Mocha”）。
     * @author: chenjie
     * @Date: 2018/7/5 10:37
     * @Param []
     * @return java.lang.String
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
