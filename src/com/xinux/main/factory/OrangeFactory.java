package com.xinux.main.factory;

/**
 * Created by Xinux on 2/9/15.
 */
public class OrangeFactory implements Factory {
	@Override
	public Fruits produce() {
		return new Orange("芦柑");
	}
}
