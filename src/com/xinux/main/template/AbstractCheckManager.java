package com.xinux.main.template;

/**
 * Java Design Pattern
 * Template Method
 * 将不变的方法抽象到父类中，将业务相关的延迟到子类中
 * Created by Xinux on 2/14/15.
 */
public abstract class AbstractCheckManager {

	public void checkBiz() {
		checkPara();
		doBizCheck();
		checkResult();
	}

	protected abstract void doBizCheck();

	private void checkPara() {
		System.out.println("参数检查");
	}

	private void checkResult() {
		System.out.println("结果检查");
	}


}
