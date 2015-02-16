package com.xinux.main.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Xinux on 2/15/15.
 */
public class StockObserver implements Observer {
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof Product && arg instanceof Integer) {
			Product product = (Product) observable;
			if (product.getStock() < 5) {
				System.out.println("您 购物车中的商品 库存紧张，剩余 " + product.getStock() + " 件");
			}
		}
	}

	public void register(Observable observable) {
		observable.addObserver(this);
	}
}
