package com.websockettest.aws;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.websockettest.Application;
import com.websockettest.entity.ChatItem;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class DynamoDBAPITest {
	
	@Autowired
	private DynamoDBAPI dynamoDBAPI;
	
	@Test
	public void putTest() {
		
		for (int i = 0; i < 10; i++) {
			ChatItem chatItem = new ChatItem();
			chatItem.setUserName("test" + String.valueOf(i));
			chatItem.setMessage("hogehogehoge" + String.valueOf(i));
			dynamoDBAPI.put(chatItem);
		}
	}
	
	@Test
	public void getChatItemsByCommentedDatetime() {
	
		List<ChatItem> chatItems = dynamoDBAPI.getChatItemsByCommentedDatetime(System.currentTimeMillis());
		System.out.println(chatItems);
	}
	
	@Test
	public void getAllTest(){
		
		System.out.println(dynamoDBAPI.getAll());
	}
	
	@Test
	public void createTableTest() throws Exception {
		dynamoDBAPI.createTable();
	}

	@Test
	public void getTableInformationTest(){
		dynamoDBAPI.getTableInformation();
	}
	@Test
	public void deleteTableTest() {
		dynamoDBAPI.deleteTable();
	}
}
