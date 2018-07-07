package com.cc.mode.observer.custom;

/**
 * @ClassName com.cc.mode.observer
 * @Description:
 * @Author chenjie
 * @Date Created in 星期六 2018/6/30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer analyzeObserver = new AnalyzeObserver();
        Observer currentObserver = new CurrentObserver();
        //观察者订阅主题
        subject.registerObserver(analyzeObserver);
        subject.registerObserver(currentObserver);
        subject.setMeasurements("13");
        //analyzeObserver观察者取消订阅
        subject.removeOvserver(analyzeObserver);
        subject.setMeasurements("14");

    }
}
