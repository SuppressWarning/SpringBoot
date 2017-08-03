package com.oufaxin.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringMVC {

	@RequestMapping("hello")
	public String info() {
		return "Hello world!";
	}
}

