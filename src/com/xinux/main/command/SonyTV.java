package com.xinux.main.command;

/**
 * Created by Xinux on 2/15/15.
 */
public class SonyTV implements TV{

	private enum State{
		OPEN, ClOSE;
	}

	private State state;

	public SonyTV() {
		this.state = State.ClOSE;
	}

	@Override
	public void open() {
		if (state == State.ClOSE) {
			state = State.OPEN;
			System.out.println("打开电视");
		}
	}

	@Override
	public void close() {
		if (state == State.OPEN) {
			state = State.ClOSE;
			System.out.println("关闭电视");
		}
	}

	@Override
	public void change(int channel) {
		if (state == State.OPEN) {
			System.out.println("切换到 " + channel + " 频道");
		}
	}
}
