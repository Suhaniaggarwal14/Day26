package com.graymatter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Author;
import com.graymatter.entities.Book;
import com.graymatter.repositories.AuthorRepository;

import jakarta.transaction.Transactional;

@Service
public class AuthorService {
	@Autowired
	AuthorRepository repository;
	
	public void saveAuthorWithBooks() {
		Author author=new Author("BalaguruSwami");
		Book book1=new Book("DataScience");
		Book book2=new Book(" Understanding C");
		author.addBook(book1);
		author.addBook(book2);
		
		repository.save(author);
		
	}
	@Transactional
	public void removeAuthor(int id) {
		
		repository.deleteById(id);
	}
	
	
	

}
