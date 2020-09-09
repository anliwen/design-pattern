package com.singleton.section1;

/**
 * 1. DCL单例模式+Volatile【可用】
 * 2. 为了解决方法四存在的线程不安全问题,我们引入双重锁,即Double-Check-Locking
 *    同时引入volatile关键字修饰实例对象,这是为了强调instance及时可见行
 * 3. 线程安全性:线程安全
 * 4. 是否懒加载:懒加载
 * 5. 性能:性能比较好
 */
public class Singleton5 {
	private static volatile Singleton5 instance = null;

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		if (null == instance) {
			synchronized (Singleton5.class) {
				if (null == instance) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
