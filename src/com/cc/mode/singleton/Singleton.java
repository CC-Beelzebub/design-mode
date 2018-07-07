package com.cc.mode.singleton;

/**
 * @ClassName com.cc.mode.singleton
 * @Description: 单例模式-双重锁定+volatile
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class Singleton {
    private volatile static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();//使用volatile禁止此处的重排序
                }

            }
        }
        return singleton;
    }
}
