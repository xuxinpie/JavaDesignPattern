package com.xinux.main.simpleFactory;

/**
 * 水果工厂类
 * Created by Xinux on 2/9/15.
 */
public class FruitsFactory {
	protected enum FRUITS {
		APPLE, ORANGE;
	}

	public static Fruits factory(FRUITS type) {
		switch (type) {
			case APPLE: {
				return new Apple("红富士");
			}
			case ORANGE: {
				return new Orange("砀山梨");
			}
			default: {
				throw new UnsupportedOperationException();
			}
		}
	}
}
