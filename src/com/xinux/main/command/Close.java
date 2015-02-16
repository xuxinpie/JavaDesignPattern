package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class Close implements Command {

	private TV tv;

	public Close(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.close();
	}
}
