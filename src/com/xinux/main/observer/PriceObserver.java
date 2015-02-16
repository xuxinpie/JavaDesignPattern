package com.xinux.main.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Xinux on 2/15/15.
 */
public class PriceObserver implements Observer {
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof Product && arg instanceof Double) {
			Product product = (Product) observable;
			System.out.println("您 购物车中的商品价格有新的变化 当前价格是 " + product.getPrice() + " 元");
		}
	}

	public void register(Observable observable) {
		observable.addObserver(this);
	}
}
