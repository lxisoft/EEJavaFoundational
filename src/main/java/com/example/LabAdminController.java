package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/lab")

public class LabAdminController {

	@RequestMapping("/admin")
	public String hello(){
		return ".........................Lab Profile Administration completed.............";
		
	}
}
