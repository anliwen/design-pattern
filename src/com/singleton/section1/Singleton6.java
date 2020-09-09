package com.singleton.section1;

/**
 * 1. Holder单例模式(静态内部类,与饿汉式基本相同)【强烈推荐】
 * 2. 声明类时,成员变量中不声明实例变量,而是放到静态内部类中
 *    这种方式和懒汉式有些相似,它们都采用了类装载的机制来保证初始化实例时只有一个线程
 *    不同的是,Holder单例模式是将实例的初始化放到了静态类中去实现,从而实现了懒加载。
 * 3. 线程安全性:线程安全
 * 4. 是否懒加载:否
 * 5. 性能:性能好
 */
public class Singleton6 {
	private static Singleton6 instance = null;

	private Singleton6() {
	}

	public static Singleton6 getInstance() {
		return Holder.instance;
	}

	private static class Holder {
		private static Singleton6 instance = new Singleton6();
	}
}
