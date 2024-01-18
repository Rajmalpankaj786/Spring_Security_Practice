package com.Security.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
   
	@GetMapping(value = "/spring")
	public String printfunc1() {
		return "hello spring security";
	}
	@GetMapping(value = "/integer")
	public Integer printfunc2() {
		return 555;
	}
	
	
	
}
