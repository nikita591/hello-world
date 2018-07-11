package com.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.client.service.MyServiceInterface;

@SpringBootApplication

@Controller
//@ComponentScan("com.client.service")
@ComponentScan("com.client")
public class MyController {

	public static void main(String[] args) {
		SpringApplication.run(MyController.class, args);
	}
	
	
	@Autowired
	MyServiceInterface myService;
	@Qualifier("MyServiceInterface")
	
	@RequestMapping("/mycontroller")
	@ResponseBody
	public String mycontroller()
	{
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("###############In Controller . . .");
		myService.myserviceMethod();
		return "Hello World";
		
		
	}
}
