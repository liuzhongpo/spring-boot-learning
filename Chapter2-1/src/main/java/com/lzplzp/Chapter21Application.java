package com.lzplzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter21Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter21Application.class, args);
		//Spring Boot提供了屏蔽命令行访问属性的设置
//		new SpringApplication().setAddCommandLineProperties(false);
	}

}
