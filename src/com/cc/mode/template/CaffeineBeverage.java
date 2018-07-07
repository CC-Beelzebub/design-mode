package com.cc.mode.template;

/**
 * @ClassName com.cc.mode.template
 * @Description: 咖啡因饮料抽象类，茶和咖啡都属于咖啡因饮料
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public abstract class CaffeineBeverage {
    //模板方法
    final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        //通过钩子函数改变算法的行为
        if (customerWantsCondiments()) {
            this.addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //各个子类表现不同，所以设置为抽象方法，让子类实现
    abstract void brew();

    abstract void addCondiments();

    //钩子函数提供默认实现，由子类决定是否需要挂钩
    boolean customerWantsCondiments() {
        return true;
    }

}
