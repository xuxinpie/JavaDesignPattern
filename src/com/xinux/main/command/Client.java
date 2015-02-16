package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class Client {
	public static void main(String[] args) {
		TV tv = new SonyTV();
		TVController controller = new TVController(tv);

		controller.open();
		controller.channelOne();
		controller.channelTwo();
		controller.close();
	}
}
