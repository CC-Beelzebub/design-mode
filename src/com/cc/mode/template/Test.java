package com.cc.mode.template;

/**
 * @ClassName com.cc.mode.template
 * @Description:
 * 模板设计模式
 * @Author chenjie
 * @Date Created in 星期日 2018/7/1
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Tes tes = new Tes();
        tes.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        //使用钩子改变算法行为
        tes.prepareRecipe();
    }
}
