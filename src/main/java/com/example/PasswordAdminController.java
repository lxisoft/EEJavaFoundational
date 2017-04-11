package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/password")

public class PasswordAdminController {

	
	

		@RequestMapping("/admin")
		public String hello(){
			return "......................... Password Administration completed.............";
			
		
	}

}
