package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class Change implements Command {

	private int channel;
	private TV tv;

	public Change(int channel, TV tv) {
		this.channel = channel;
		this.tv = tv;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void execute() {
		tv.change(channel);
	}
}
