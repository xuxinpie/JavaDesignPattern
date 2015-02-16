package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public interface TV {

	/**
	 * 打开电视
	 */
	public void open();

	/**
	 * 关闭电视
	 */
	public void close();

	/**
	 * 切换频道
	 * @param channel
	 */
	public void change(int channel);
}
