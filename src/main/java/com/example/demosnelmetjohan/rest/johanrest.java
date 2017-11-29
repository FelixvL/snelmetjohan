package com.example.demosnelmetjohan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class johanrest {
	@GetMapping("/johan")
	public String doethet() {
		return "Hij doet het";
	}
}
