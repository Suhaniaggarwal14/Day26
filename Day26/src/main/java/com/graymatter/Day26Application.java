package com.graymatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graymatter.services.AuthorService;

@SpringBootApplication
public class Day26Application implements CommandLineRunner{
	@Autowired
	AuthorService service;

	public static void main(String[] args) {
		SpringApplication.run(Day26Application.class, args);
		
		
	}
	
	
		public void run(String...args) {
			service.saveAuthorWithBooks();
			
		}
	}


