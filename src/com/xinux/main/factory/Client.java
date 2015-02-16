package com.xinux.main.factory;

/**
 * Created by Xinux on 2/9/15.
 */
public class Client {
	public static void main(String[] args) {
		Fruits apple = new AppleFactory().produce();
		Fruits orange = new OrangeFactory().produce();

		System.out.println(apple.getName() + " " + orange.getName());
	}
}
