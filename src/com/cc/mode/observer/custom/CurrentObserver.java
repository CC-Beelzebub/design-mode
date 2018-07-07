package com.cc.mode.observer.custom;

/**
 * @ClassName com.cc.mode.observer
 * @Description:
 * @Author chenjie
 * @Date Created in 星期六 2018/6/30
 * @Version 1.0
 */
public class CurrentObserver implements Observer, DisplayCanvas {
    private String temperature;

    @Override
    public void update(String temperature) {
        this.temperature = temperature;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("CurrentObserver temperature=" + temperature);
    }
}
