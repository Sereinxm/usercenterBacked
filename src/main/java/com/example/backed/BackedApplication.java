package com.example.backed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.backed.mapper")
public class BackedApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackedApplication.class, args);
	}

}
