package com.xinux.main.template;

/**
 * Created by Xinux on 2/14/15.
 */
public class Mypopulator extends AbstractCheckManager {

	@Override
	protected void doBizCheck() {
		System.out.println("子业务检查");
	}
}
