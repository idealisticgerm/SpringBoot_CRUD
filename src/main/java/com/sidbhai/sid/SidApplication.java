package com.sidbhai.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sidbhai.sid")
public class SidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidApplication.class, args);
	}

}
