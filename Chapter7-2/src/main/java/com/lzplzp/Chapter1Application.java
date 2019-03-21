package com.lzplzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //让@Async注解能够生效，还需要在Spring Boot的主程序中配置@EnableAsync
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}

}
