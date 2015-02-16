package com.xinux.main.strategy;

/**
 * Created by Xinux on 2/15/15.
 */
public class Client {
	public static void main(String[] args) {
		new SmsSender(new OnceAday()).sendSms(new Message());
		new SmsSender(new OnceAweek()).sendSms(new Message());

		new SmsSender(new SendStrategy() {
			@Override
			public boolean send(Message message) {
				System.out.println("每天两次");
				return true;
			}
		}).sendSms(new Message());
	}
}
