package com.online.bank.digital;

import com.online.bank.digital.model.Account;
import com.online.bank.digital.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(AccountRepository repository) {
		return args -> {
			repository.save(new Account(1, "des", "test", "test", "test"));
		};
	}
}
