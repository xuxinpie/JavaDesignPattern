package com.xinux.main.strategy;

/**
 * Created by Xinux on 2/15/15.
 */
public class SmsSender {
	private SendStrategy sendStrategy;

	public SmsSender(SendStrategy sendStrategy) {
		this.sendStrategy = sendStrategy;
	}

	public void sendSms(Message message) {
		sendStrategy.send(message);
	}
}
