package com.cybin.userprj;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class UserprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserprjApplication.class, args);

		log.info("Recuperamos al usuario con email xxx@xxx.com");

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			log.info("TEST1");
			UsersService service = context.getBean(UsersService.class);
			//service.findUser("xxx@xxx.com");
		};
	}

}
