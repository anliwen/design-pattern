package com.singleton.section1;

/**
 * 1. Enum单例模式【强烈推荐】借助了enum枚举类天生单例的特性,直接解决了多线程同步问题
 * 2. 线程安全性:线程安全性
 * 3. 是否懒加载:懒加载
 * 4. 性能:性能好
 */
public class Singleton7 {
	private Singleton7() {
	}

	public static Singleton7 getInstance() {
		return EnumHolder.INSTANCE.getInstance();
	}

	private enum EnumHolder {
		INSTANCE;

		private Singleton7 instance = null;

		private EnumHolder() {
			instance = new Singleton7();
		}

		private Singleton7 getInstance() {
			return instance;
		}
	}
}
