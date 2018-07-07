package com.cc.mode.ornamenter;

/**
 * @ClassName com.cc.mode.ornamenter
 * @Description:
 * 飲料抽象類
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
