package com.cc.mode.ornamenter;

/**
 * @ClassName com.cc.mode.ornamenter
 * @Description:
 * 测试类
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class StartbuzzCoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //開始不加調料
        System.out.println(beverage.getDescription() + " $"
                + beverage.cost());
        //加摩卡調料
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $"
                + beverage.cost());
        //加大豆調料
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $"
                + beverage.cost());
    }
}
