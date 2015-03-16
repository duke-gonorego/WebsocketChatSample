package com.websockettest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websockettest.entity.RequestMessage;
import com.websockettest.entity.ResponseMessage;
import com.websockettest.service.ChatService;

@Controller
public class MessageController {

	private final static Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@Autowired
	private ChatService chatService;
	
	@MessageMapping("/message")
	@SendTo("/topic/message")
	public ResponseMessage greeting(RequestMessage requestMessage) throws Exception {
				
		logger.debug("USER_NAME={}", requestMessage.getUserName());
		chatService.putMessage(requestMessage);
		
		return new ResponseMessage(requestMessage.getUserName(), requestMessage.getcontent());
	}
}
