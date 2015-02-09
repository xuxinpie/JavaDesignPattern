package com.xinux.main.singleton;

/**
 *java desgin pattern
 * lazy singleton
 * Created by Xinux on 2/9/15.
 */
public class SafeLazySingleton {

	private static SafeLazySingleton instance = null;

	/**
	 * 私有化构造方法
	 */
	private SafeLazySingleton() {

	}

	/**
	 * synchronized static factory method
	 * @return
	 */
	synchronized public static SafeLazySingleton getInstance() {
		if (instance == null) {
			instance = new SafeLazySingleton();
		}

		return instance;
	}
}
