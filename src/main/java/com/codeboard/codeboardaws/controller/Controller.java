package com.codeboard.codeboardaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/getname")
	public String getName()
	{
		return "avinash";
	}

}
