package org.elib;

import org.elib.model.Author;
import org.elib.model.Book;
import org.elib.model.Periodic;
import org.elib.repository.AuthorRepository;
import org.elib.repository.BookRepository;
import org.elib.repository.PeriodicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ElibApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElibApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	PeriodicRepository periodicRepository;

	@Override
	public void run(String... args) throws Exception {
		Author author = new Author();
		author.setFirstName("Hamza");
		author.setNationality("American");
		author.setLastName("Camino");
		authorRepository.save(author);

		List<Author> authors = new ArrayList<>();
		authors.add(author);

		Book book = new Book();
		book.setSummary("alpha");
		book.setAuthors(authors);

		Periodic periodic = new Periodic();
		periodic.setSummary("some shit");
		periodic.setAuthors(authors);

		bookRepository.save(book);
		periodicRepository.save(periodic);
	}
}
