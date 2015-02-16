package com.xinux.main.proxy.dynamicProxy;

/**
 * Created by Xinux on 2/15/15.
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("Real Subject handler");
	}
}
