package com.cc.mode;

/**
 * @ClassName com.cc.mode
 * @Description: 块先于构造器执行
 * @Author chenjie
 * @Date Created in 星期日 2018/7/8
 * @Version 1.0
 */
public class Father {
    public static int sInt = 2;

    static {
        System.out.println("father static block");
    }

    public Father() {
        System.out.println("father constructor");
    }

    {
        System.out.println("father no block");
    }

}
