package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class Open implements Command {

	private TV tv;

	public Open(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.open();
	}
}
