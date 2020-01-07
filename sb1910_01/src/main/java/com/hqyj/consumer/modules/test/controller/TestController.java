package com.hqyj.consumer.modules.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test/apptest")
	public String appTest() {
		return "this is a springboot controller.";
	}
}
