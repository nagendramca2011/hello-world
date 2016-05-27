package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String home()
	{
		return "Hello, World!";
	}
	@RequestMapping("/heroku")
	public String heroku()
	{
		return "Hello from Heroku!";
	}

}
