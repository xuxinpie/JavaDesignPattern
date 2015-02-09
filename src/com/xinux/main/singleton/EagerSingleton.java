package com.xinux.main.singleton;

/**
 * java design pattern
 * 饿汉单例模式
 * Created by Xinux on 2/9/15.
 */
public class EagerSingleton {

	//init a sigleton
	private static final EagerSingleton instance = new EagerSingleton();

	/**
	 * 私有化构造方法
	 */
	private EagerSingleton() {

	}

	/**
	 * Static factory method return a instance
	 * @return
	 */
	public static EagerSingleton getInstance() {
		return instance;
	}

}
