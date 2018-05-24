package com.example.FirstWeb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "我是谷宇";
	}
}
