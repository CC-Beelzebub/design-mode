package com.cc.mode.agency.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {

	/**
	 * JDK动态代理测试类
	 */
	public static void main(String[] args) {
		//被代理的对象
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 */
		// 生成代理对象
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
				cls.getInterfaces(), h);
		m.move();
	}

}
