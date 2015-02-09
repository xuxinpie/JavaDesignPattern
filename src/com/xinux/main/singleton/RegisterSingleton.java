package com.xinux.main.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java Design Pattern
 * Register Singleton
 * Created by Xinux on 2/9/15.
 */
public class RegisterSingleton {
	//ConcurrentHashMap与HashMap相比是线程安全的
	private static Map<String, RegisterSingleton> register = new ConcurrentHashMap<String, RegisterSingleton>();

	static {
		register.put(RegisterSingleton.class.getName(), new RegisterSingleton());
	}

	private RegisterSingleton() {

	}

	public static RegisterSingleton getInstance(String name) {
		if (name == null) {
			name = RegisterSingleton.class.getName();
		}
		if (register.get(name) == null) {
			try {
				register.put(name, (RegisterSingleton) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		return register.get(name);
	}
}
