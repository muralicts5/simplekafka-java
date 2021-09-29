package com.example.greetingservice.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

	
	@KafkaListener(topicPattern = "demo-topic", concurrency = "1", groupId = "message_processing", 
			properties = {
			"enable.auto.commit=true", "max.poll.interval.ms=86400000" })
	public void consume(ConsumerRecord<String, String> record) {
		System.out.println("inside the consuer");
		System.out.println(record);
			String content = (String) record.value();
			System.out.println(content);

	}
	
}
