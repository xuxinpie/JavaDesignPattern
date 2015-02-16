package com.xinux.main.bridge;

/**Java Design Pattern
 * Bridge 抽象类与抽象方法的实现相分离
 * Created by Xinux on 2/14/15.
 */
public abstract class Noddle {

	private Style style;

	public Noddle(Style style) {
		this.style = style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	public void eat() {
		System.out.println("Eating " + style.getStyle() + " " + getName() + " Noddle");
	}

	/**
	 * 抽象方法，子类重写该方法，返回面条的类型
	 * @return
	 */
	protected abstract String getName();
}
