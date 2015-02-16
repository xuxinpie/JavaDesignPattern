package com.xinux.main.factory;

/**
 * Created by Xinux on 2/9/15.
 */
public class AppleFactory implements Factory{

	@Override
	public Fruits produce() {
		return new Apple("红富士");
	}
}
