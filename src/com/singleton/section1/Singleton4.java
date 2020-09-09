package com.singleton.section1;

/**
 * 1. 懒汉式单例模式+同步代码块【不可用】,该方法是对上面方法的一个优化,将同步方法改为同步代码块
 * 2. 线程安全性:单线程下没有问题,多线程下有可能会生成多个实例,因此线程不安全,问题同样出现在if(null == instance)这一步
 * 3. 是否懒加载:懒加载
 * 4. 性能:性能一般
 */
public class Singleton4 {
	private static Singleton4 instance = null;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		if (null == instance) {
			synchronized (Singleton4.class) {
				instance = new Singleton4();
			}
		}
		return instance;
	}
}
