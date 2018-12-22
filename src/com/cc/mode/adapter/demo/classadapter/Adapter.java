package com.cc.mode.adapter.demo.classadapter;

/**
 * @ClassName com.cc.mode.adapter.demo.classadapter
 * @Description:
 * @Author chenjie
 * @Date Created in 星期六 2018/12/22
 * @Version 1.0
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
