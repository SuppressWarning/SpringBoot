package com.oufaxin.application;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("fm")
public class TestFreeMarker {

	@RequestMapping
	public String fm(Map<String, String> root) {
		root.put("word", "HelloWorld!");
		return "template";
	}
}
