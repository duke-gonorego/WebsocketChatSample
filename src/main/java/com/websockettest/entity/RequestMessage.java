package com.websockettest.entity;

import java.io.Serializable;

public class RequestMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String content;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getcontent() {
		return content;
	}
}
