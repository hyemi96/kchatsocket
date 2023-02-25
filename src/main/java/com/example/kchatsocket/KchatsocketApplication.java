package com.example.kchatsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class KchatsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(KchatsocketApplication.class, args);
	}

}
