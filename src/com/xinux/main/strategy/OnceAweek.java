package com.xinux.main.strategy;

/**
 * Created by Xinux on 2/15/15.
 */
public class OnceAweek implements SendStrategy {

	@Override
	public boolean send(Message message) {
		System.out.println("每周一次");
		return false;
	}
}
