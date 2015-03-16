package com.websockettest.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websockettest.service.ChatService;

@Controller
public class ChatController {

	private final static Logger logger = LoggerFactory.getLogger(ChatController.class);

	@Autowired
	private ChatService chatService;
	
	@RequestMapping("/chat")
	public String index(HttpServletRequest request, Model model) {
		
		String userName = request.getRemoteUser();
		
		model.addAttribute("userName", userName);
		model.addAttribute("chatItems", chatService.loadPastMessage());
		
		return "chat";
	}
}
