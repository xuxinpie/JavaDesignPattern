package com.xinux.main.proxy.staticProxy;

/**
 * Created by Xinux on 2/15/15.
 */
public class RealTopic implements AbstractTopic {

	@Override
	public void request() {
		System.out.println("Real topic received request");
	}
}
