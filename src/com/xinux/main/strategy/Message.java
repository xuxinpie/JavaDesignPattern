package com.xinux.main.strategy;

import java.util.Date;

/**
 * Created by Xinux on 2/15/15.
 */
public class Message {
	private String title;
	private String content;
	private Date date;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
