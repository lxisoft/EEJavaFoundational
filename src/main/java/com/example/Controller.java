package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/new")

public class Controller {

	@RequestMapping("/hello")
	public String hello(){
		return "helloooo..hygygy...";
		
	}
<<<<<<< HEAD
=======
	
	@RequestMapping("/hellobed")
	public String hello(){
		return "bed is ready.......";
		
	}
>>>>>>> 68b95a64d1a2f1ab729724fa8e0b7565ab56ea42
}
