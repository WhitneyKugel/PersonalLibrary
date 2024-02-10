package com.whitneykugel.PersonalLibrary.renter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class RenterConfig {

	@Bean
	CommandLineRunner commandLineRunner(RenterRepository renterRepository) {
		return args -> {
			Renter john = Renter.builder()
					.firstName("John")
					.lastName("Doe")
					.email("doe.john@email.com")
					.dob(LocalDate.of(2000, Month.JUNE, 1))
					.build();


			Renter jack = Renter.builder()
					.firstName("Jack")
					.lastName("Jackson")
					.email("jackson.jack@email.com")
					.dob(LocalDate.of(2004, Month.JANUARY, 1))
					.build();
		};
	}
}
