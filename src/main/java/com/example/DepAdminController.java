package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/dep")

public class DepAdminController {

	@RequestMapping("/depAdmin")
	public String hello(){
		return ".........................Department Administration............";
		
	}
}