package com.cc.mode.singleton;

/**
 * @ClassName com.cc.mode.singleton
 * @Description: 单例模式-枚举实现
 * @Author chenjie
 * @Date Created in 星期四 2018/7/5
 * @Version 1.0
 */
public class EnumSingleton {
    public static EnumSingleton enumSingleton = null;

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    enum Singleton {
        INSTANCE;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }


    }
}
