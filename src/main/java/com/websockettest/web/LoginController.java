package com.websockettest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
