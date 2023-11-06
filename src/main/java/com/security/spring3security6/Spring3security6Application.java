package com.security.spring3security6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Spring3security6Application {

	public static void main(String[] args) throws Throwable  {
		Locale.setDefault(Locale.ENGLISH);
		SpringApplication.run(Spring3security6Application.class, args);
	}

}
