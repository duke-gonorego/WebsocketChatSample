package com.websockettest.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.websockettest.Application;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ChatServiceTest {

	@Autowired
	private ChatService chatService;
	
	@Test
	public void test() {
		
		System.out.println(chatService.loadPastMessage());
	}

}
