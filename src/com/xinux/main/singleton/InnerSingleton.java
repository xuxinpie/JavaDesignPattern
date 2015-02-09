package com.xinux.main.singleton;

/**
 * Java Design Pattern
 * Inner Class  解决延迟初始化和线程安全的问题
 * Created by Xinux on 2/9/15.
 */
public class InnerSingleton {

	/**
	 * 私有化构造方法
	 */
	private InnerSingleton() {

	}

	/**
	 * Static Inner Class
	 * 1. 要创建嵌套类的对象，并不需要其外围类的对象。
	 * 2. 不能从嵌套类的对象中访问非静态的外围类对象。
	 * 持有实例
	 */
	private static class InstanceHolder {
		static InnerSingleton instance =  new InnerSingleton();
	}

	/**
	 * 静态工厂方法
	 * @return
	 */
	public static InnerSingleton getInstance() {
		return InstanceHolder.instance;
	}
}
