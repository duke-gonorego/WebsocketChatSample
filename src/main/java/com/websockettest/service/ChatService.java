package com.websockettest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websockettest.aws.DynamoDBAPI;
import com.websockettest.entity.ChatItem;
import com.websockettest.entity.RequestMessage;

@Service
public class ChatService {

	private final static Logger logger = LoggerFactory.getLogger(ChatService.class);
	
	@Autowired
	private DynamoDBAPI dynamoDBAPI;
	
	public List<ChatItem> loadPastMessage() {
		
		return dynamoDBAPI.getChatItemsByCommentedDatetime(System.currentTimeMillis());
	}
	
	public void putMessage(RequestMessage requestMessage){
		
		ChatItem chatItem = new ChatItem();
		chatItem.setUserName(requestMessage.getUserName());
		chatItem.setMessage(requestMessage.getcontent());
		
		dynamoDBAPI.put(chatItem);
	}
}
