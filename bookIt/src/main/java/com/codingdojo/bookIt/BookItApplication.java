package com.codingdojo.bookIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { BookItApplication.class, Jsr310JpaConverters.class }
	)
@SpringBootApplication
public class BookItApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookItApplication.class, args);
	}

}
