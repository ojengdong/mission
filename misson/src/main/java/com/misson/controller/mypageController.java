package com.misson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mypageController {
	
	@GetMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
}
