package com.codingdojo.holahumano.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	@RequestMapping("/")
	public String index(
			@RequestParam(value = "name", required = false) String name, 
			@RequestParam(value = "last_name", required = false) String lastName,
			@RequestParam(value = "times", required = false) Integer times) {
		
		String result = "Hola ";
		
		if (name == null) {
			result += "humano";
		} else {
			result += name + " ";
		}
		
		if (lastName != null) {
			result += lastName + " ";
		}
		
		if (times != null) {
			result = result.repeat(times);
		}
		
		return result;
	}
}
