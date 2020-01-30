package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.task.Rocket;

public class ThreadTester {
public static void main(String[] args) {
	try {
		
		String metaInfo = "spring.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfo);
		
		Labour ref1 =container.getBean(Labour.class); 
		ref.lanunch();
		ref1.work();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
