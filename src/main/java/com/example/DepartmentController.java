package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/DepartmentAdmin")

public class DepartmentController {

	@RequestMapping("/department")
	public String department(){
		return "department is completed";
		
	}

}
