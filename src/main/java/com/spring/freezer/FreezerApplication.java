package com.spring.freezer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FreezerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreezerApplication.class, args);
	}

}
