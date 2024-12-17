package com.example.restapicam.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

}

@RestController
class WelcomeController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to the cool REST API!";
	}
}


