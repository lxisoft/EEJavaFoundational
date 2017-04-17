package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/new")

public class Controller {

	@RequestMapping("/hello")
	public String hello(){
		return "helloooo.bobiger...";
		
	}

}
