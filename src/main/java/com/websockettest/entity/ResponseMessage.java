package com.websockettest.entity;

import java.io.Serializable;

public class ResponseMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String content;
	
	public ResponseMessage(String userName, String content) {
		this.userName = userName;
		this.content = content;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getContent(){
		return content;
	}
}
