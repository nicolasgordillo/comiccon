package com.boot.subsidios.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//@RequestMapping("/")
	public String Home() {
		return "index";
	}
}
