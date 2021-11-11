package com.groupeflutter.groupeflutterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GroupeflutterapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupeflutterapiApplication.class, args);
	}

	@GetMapping("")
	public String sayHello()
	{
		return "Bonjour...........";
	}
}
