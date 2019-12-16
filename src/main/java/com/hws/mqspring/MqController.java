package com.hws.mqspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping("send")
	public String send() {
		try {
			jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World!");
			return "OK";
		} catch (JmsException ex) {
			ex.printStackTrace();
			return "FAIL";
		}
	}

	@GetMapping("recv")
	public String recv() {
		try {
			return jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
		} catch (JmsException ex) {
			ex.printStackTrace();
			return "FAIL";
		}
	}
}
