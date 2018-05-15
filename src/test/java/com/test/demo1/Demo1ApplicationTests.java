package com.test.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.demo1.producer.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Autowired  
	private Producer producer;  
	
	@Test  
	public void testActivemq(){  
		producer.sendMessage("look this is a message==zycc==");  
		while(true){}  
	} 

	@Test
	public void contextLoads() {
	}

}
