package com.misson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class agreeController {

	@GetMapping("/agree")
	public String agree() {
		return "agree";
	}
}
