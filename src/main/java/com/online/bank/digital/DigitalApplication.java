package com.online.bank.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigitalApplication.class, args);
	}
}


/*	@Bean
	CommandLineRunner runner(AccountRepository repository) {
		return args -> {

			repository.save(new Account(1, "des", "test", "test", "test",
					new Balance(), new AccountLimit(), new AccountCategory()));
		};
	}*/
