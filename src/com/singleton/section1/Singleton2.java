package com.singleton.section1;

/**
 * 1. 懒汉式单例模式【多线程有问题】
 * 2. 线程安全性:单线程下没有问题,多线程下有可能会生成多个实例,因此线程不安全
 *    问题出现在if(null == instance)这一步,多线程环境中可能会有多个线程同时拿到instance的值为null
 * 3. 是否懒加载:懒加载
 * 4. 性能比较好
 */
public class Singleton2 {
	private static Singleton2 instance = null;

	private Singleton2() {
	}

	// 在使用时才进行加载
	public static Singleton2 getInstance() {
		if (null == instance) {
			instance = new Singleton2();
		}
		return instance;
	}
}
