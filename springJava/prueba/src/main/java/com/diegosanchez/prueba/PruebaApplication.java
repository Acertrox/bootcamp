package com.diegosanchez.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@RequestMapping("/")
	public String Hello(){
		return "Hello Client! How are you doing?";
	}
	@RequestMapping("/random")
	public String HelloRandom(){
		return "Spring Boot is great! So easy to just respond with Strings";
	}
}
