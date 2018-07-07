package com.cc.mode.observer.jdk;

import java.util.Observable;

/**
 * @ClassName com.cc.mode.observer.jdk
 * @Description:
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public class WeathData extends Observable {
    private String temperature;

    /**
     * 方便测试，天气状态变化时
     *
     * @param temperature
     */
    public void setMeasurements(String temperature) {
        this.temperature = temperature;
        this.measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public String getTemperature() {
        return temperature;
    }
}
