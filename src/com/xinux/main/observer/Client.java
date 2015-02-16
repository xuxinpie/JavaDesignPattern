package com.xinux.main.observer;

/**
 * Created by Xinux on 2/15/15.
 */
public class Client {
	public static void main(String[] args) {
		Product monitorState = new Product();
		new StockObserver().register(monitorState);
		monitorState.setPrice(100);
		monitorState.setStock(1);

		new PriceObserver().register(monitorState);
		monitorState.setPrice(99);
		monitorState.setStock(2);
	}
}
