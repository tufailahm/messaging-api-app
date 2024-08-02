package com.training.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController
{
	@GetMapping("oracle")
	public String printGreetings()
	{
		return "Hi Oracle!!";
	}
}