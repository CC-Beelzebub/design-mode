package com.cc.mode.observer.jdk;


/**
 * @ClassName com.cc.mode.observer
 * @Description:
 * 使用jdk内置观察者模式
 * @Author chenjie
 * @Date Created in 星期六 2018/6/30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        WeathData weathData = new WeathData();
        AnalyzeObserver analyzeObserver = new AnalyzeObserver();
        CurrentObserver currentObserver = new CurrentObserver();
        weathData.addObserver(analyzeObserver);
        weathData.addObserver(currentObserver);
        weathData.setMeasurements("12");
        //删除currentObserver
        weathData.deleteObserver(currentObserver);
        weathData.setMeasurements("13");
    }
}
