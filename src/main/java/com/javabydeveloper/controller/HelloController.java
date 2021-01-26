package com.javabydeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabydeveloper.service.MessageService;

@RestController
public class HelloController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		 String user ="Azure";
		return messageService.getSubscriptionMessage(user);
	}

}
