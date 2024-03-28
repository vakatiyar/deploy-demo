package com.sopra.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HomeController {

	@GetMapping("/msg")
	public String display()
	{
		return "hey";
	}
}
