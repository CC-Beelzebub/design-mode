package com.cc.mode;

/**
 * @ClassName com.cc.mode
 * @Description: 成员变量不具备多态性
 * @Author chenjie
 * @Date Created in 星期日 2018/7/8
 * @Version 1.0
 */
public class Sub extends Father {
    public static int sInt = 1;

    static {
        System.out.println("Sub static block");
    }


    public Sub() {
        System.out.println("Sub constructor");
    }

    {
        System.out.println("sub no block");
    }

    public static void main(String[] args) {
        new Sub();
        Father temp = new Sub();
        System.out.println("sInt = " + temp.sInt);
        Father father = new Father();
        System.out.println("sInt = " + father.sInt);
        Sub sub = new Sub();
        System.out.println("sInt = " + sub.sInt);
    }

}
