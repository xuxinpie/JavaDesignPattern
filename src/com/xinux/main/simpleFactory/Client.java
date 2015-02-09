package com.xinux.main.simpleFactory;

/**
 * Created by Xinux on 2/9/15.
 */
public class Client {
	public static void main(String[] args) {
		Fruits apple = FruitsFactory.factory(FruitsFactory.FRUITS.APPLE);
		Fruits orange = FruitsFactory.factory(FruitsFactory.FRUITS.ORANGE);

		System.out.println(apple.getName() + " " + orange.getName());
	}
}
