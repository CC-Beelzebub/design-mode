package com.cc.mode.adapter.demo.objectadapter;

/**
 * @ClassName com.cc.mode.adapter.demo.objectadapter
 * @Description:
 * @Author chenjie
 * @Date Created in 星期六 2018/12/22
 * @Version 1.0
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget");
    }
}
