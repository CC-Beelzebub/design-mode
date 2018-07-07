package com.cc.mode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName com.cc.mode.observer
 * @Description:
 * @Author chenjie
 * @Date Created in 星期六 2018/6/30
 * @Version 1.0
 */
public class AnalyzeObserver implements Observer, DisplayCanvas {
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
        System.out.println("JDK AnalyzeObserver temperature=" + temperature);

    }
}
