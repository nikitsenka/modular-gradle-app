package com.nikitsenka.modulargradleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModularGradleAppApplication {

    private User user;

	public static void main(String[] args) {
		SpringApplication.run(ModularGradleAppApplication.class, args);
	}

}
