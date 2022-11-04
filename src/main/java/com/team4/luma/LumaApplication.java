package com.team4.luma;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan(basePackages = "com.team4.luma")
@EnableJpaRepositories(basePackages = "com.team4.luma")
@Slf4j
@Configuration
public class LumaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LumaApplication.class, args);
		System.out.println("Started Project");
	}

}
