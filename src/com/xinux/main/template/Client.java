package com.xinux.main.template;

/**
 * 与策略方法相比，模板方法实现的是策略的一部分
 * 策略模式是对算法整体进行抽象
 * Created by Xinux on 2/14/15.
 */
public class Client {
	public static void main(String[] args) {
		AbstractCheckManager manager = new Mypopulator();
		manager.checkBiz();
	}
}
