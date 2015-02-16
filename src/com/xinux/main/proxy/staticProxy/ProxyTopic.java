package com.xinux.main.proxy.staticProxy;

/**
 * Created by Xinux on 2/15/15.
 */
public class ProxyTopic implements AbstractTopic {

	AbstractTopic realTopic = new RealTopic();

	public ProxyTopic(AbstractTopic topic) {
		realTopic = topic;
	}

	@Override
	public void request() {
		preRequest();
		realTopic.request();
	}

	private void preRequest() {
		System.out.println("Proxy, 前置参数检查");
	}
}
