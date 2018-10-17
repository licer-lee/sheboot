package com.licerlee.sheboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication注解相当于使用@Configuration， @EnableAutoConfiguration并@ComponentScan与他们的默认属性
@SpringBootApplication
public class ShebootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShebootApplication.class, args);
	}
}
