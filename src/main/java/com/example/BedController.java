package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/BedAdmin")

public class BedController {

	@RequestMapping("/bed")
	public String bed(){
		return "Bed administration is done";
		
	}

}
