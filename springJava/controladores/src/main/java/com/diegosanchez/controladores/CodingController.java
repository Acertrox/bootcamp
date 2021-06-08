package com.diegosanchez.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController{
	@RequestMapping("")
	public String greeting(){
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/python")
	public String greetPython(){
		return "¡Python/Django fue increíble!";
	}
	@RequestMapping("/java")
	public String greetJava(){
		return "¡Java/Spring es mejor!";
	}
}
