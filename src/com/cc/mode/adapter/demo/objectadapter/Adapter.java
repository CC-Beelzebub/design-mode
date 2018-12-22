package com.cc.mode.adapter.demo.objectadapter;

/**
 * @ClassName com.cc.mode.adapter.demo.objectadapter
 * @Description: 适配器
 * @Author chenjie
 * @Date Created in 星期六 2018/12/22
 * @Version 1.0
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
