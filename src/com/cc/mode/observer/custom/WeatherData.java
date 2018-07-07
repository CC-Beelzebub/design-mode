package com.cc.mode.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName com.cc.mode.observer
 * @Description: 主题对象
 * @Author chenjie
 * @Date Created in 星期六 2018/6/30
 * @Version 1.0
 */
public class WeatherData implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private String temperature;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    /**
     * 方便测试，天气状态变化时
     *
     * @param temperature
     */
    public void setMeasurements(String temperature) {
        this.temperature = temperature;
        this.measurementsChanged();
    }

    @Override
    public void removeOvserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }
}
