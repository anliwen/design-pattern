package com.singleton.section1;

/**
 * 1. 懒汉式单例模式+同步方法【性能差，不推荐使用】
 * 2. 线程安全性:线程安全
 * 3. 是否懒加载:懒加载
 * 4. 性能:synchronized修饰方法,使得多线程执行退化为串行执行,性能差
 */
public class Singleton3 {
	private static Singleton3 instance = null;

	private Singleton3() {
	}

	public static synchronized Singleton3 getInstance() {
		if (null == instance) {
			instance = new Singleton3();
		}
		return instance;
	}
}
