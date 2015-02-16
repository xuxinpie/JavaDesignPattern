package com.xinux.main.strategy;

/**
 * Created by Xinux on 2/15/15.
 */
public class OnceAday implements SendStrategy {

	@Override
	public boolean send(Message message) {
		System.out.println("每天一次");
		return false;
	}
}
