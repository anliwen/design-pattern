package com.singleton.section1;

/**
 * 1. 饿汉式单例模式【可用】
 * 2. 线程安全性:实例在类加载的时候即被实例化,因此线程安全。
 * 3. 是否懒加载:没有延迟加载,如果长时间没用到这个实例,则会造成内存的浪费。
 * 4. 性能比较好
 */
public class Singleton1 {
	// 在类加载的时候即被实例化
	private static Singleton1 instance = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return instance;
	}
}
