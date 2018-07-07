package com.cc.mode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName com.cc.mode.observer.jdk
 * @Description:
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public class CurrentObserver implements Observer, DisplayCanvas {
    private String temperature;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeathData) {
            WeathData weathData = (WeathData) o;
            this.temperature = weathData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("JDK CurrentObserver temperature=" + temperature);
    }

    
}
