package com.xinux.main.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Java Design Pattern
 * Dynamic Proxy Method
 * Created by Xinux on 2/15/15.
 */
public class Client {
	public static void main(String[] args) {
		Subject real = new RealSubject();
		InvocationHandler handler = new SubjectHandler(real);
		ClassLoader cl = Subject.class.getClassLoader();
		Subject proxy = (Subject) Proxy.newProxyInstance(cl, real.getClass().getInterfaces(), handler);
		proxy.request();
	}
}
