package com.example.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.greetingservice.producer.MessageProducer;

@SpringBootApplication
public class GreetingServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context=(ApplicationContext) SpringApplication.run(GreetingServiceApplication.class, args);
		MessageProducer messageProducer=(MessageProducer) context.getBean("messageProducer");
		messageProducer.sendMessage("test 1234");
	
	}

}
