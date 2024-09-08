package com.tasnimt.taz_book_network_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TazBookNetworkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TazBookNetworkApiApplication.class, args);
	}

}
