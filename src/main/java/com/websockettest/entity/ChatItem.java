package com.websockettest.entity;

import java.io.Serializable;

public class ChatItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private long commented_datetime;
	
	private String message;

	public ChatItem(){
		commented_datetime = System.currentTimeMillis();
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getCommented_datetime() {
		return commented_datetime;
	}

	public void setCommented_datetime(long commented_datetime) {
		this.commented_datetime = commented_datetime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ChatItem [userName=" + userName + ", commented_datetime="
				+ commented_datetime + ", message=" + message + "]";
	}
}