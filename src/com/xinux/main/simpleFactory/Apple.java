package com.xinux.main.simpleFactory;

/**
 * Created by Xinux on 2/9/15.
 */
public class Apple implements Fruits {

	private String name;

	public Apple(String name) {
		super();
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
