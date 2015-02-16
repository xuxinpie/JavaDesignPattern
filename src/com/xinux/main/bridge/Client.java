package com.xinux.main.bridge;

/**
 * Created by Xinux on 2/14/15.
 */
public class Client {

	public static void main(String[] args) {
		Noddle noddle = new BeefNoddle(new HotStyle());
		noddle.eat();
	}


}
