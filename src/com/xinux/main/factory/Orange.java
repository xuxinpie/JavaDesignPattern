package com.xinux.main.factory;


/**
 * Created by Xinux on 2/9/15.
 */
public class Orange implements Fruits {

	private String name;

	public Orange(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
