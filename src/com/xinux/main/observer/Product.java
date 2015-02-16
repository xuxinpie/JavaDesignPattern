package com.xinux.main.observer;

import java.util.Observable;

/**
 * Created by Xinux on 2/15/15.
 */
public class Product extends Observable {

	private final int id = 103;
	private int stock = 100;
	private double price = 100.00;

	public int getStock() {
		return stock;
	}

	public double getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}

	public void setStock(int stock) {
		this.stock = stock;
		sendNotify(stock);
	}

	public void setPrice(double price) {
		this.price = price;
		sendNotify(price);
	}

	public void sendNotify(Object object) {
		setChanged();
		notifyObservers(object);
	}
}
