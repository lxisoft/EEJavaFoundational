package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/lab")

public class LabController {

	@RequestMapping("/analysis")
	public String hello(){
		return ".........................Lab Analysis Management completed.............";
		
	}
}

