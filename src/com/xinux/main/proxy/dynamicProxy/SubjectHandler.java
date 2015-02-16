package com.xinux.main.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Xinux on 2/15/15.
 */
public class SubjectHandler implements InvocationHandler {

	private Subject subject;

	public SubjectHandler(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		System.out.println("before method");
		obj = method.invoke(subject, args);
		System.out.println("after method");
		return obj;
	}
}
