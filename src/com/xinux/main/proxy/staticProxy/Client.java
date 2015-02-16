package com.xinux.main.proxy.staticProxy;

/**
 * Java Design Pattern
 * Proxy Method  Static Proxy Method
 * Created by Xinux on 2/15/15.
 */
public class Client {
	public static void main(String[] args) {
		AbstractTopic topic = new ProxyTopic(new RealTopic());
		topic.request();
	}
}
