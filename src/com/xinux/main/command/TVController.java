package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class TVController {
	private Command open;
	private Command close;
	private Command one;
	private Command two;

	public TVController(TV tv) {
		open = new Open(tv);
		close = new Close(tv);
		one = new Change(1, tv);
		two = new Change(2, tv);
	}

	public void open() {
		open.execute();
	}

	public void close() {
		close.execute();
	}

	public void channelOne() {
		one.execute();
	}

	public void channelTwo() {
		two.execute();
	}
}
