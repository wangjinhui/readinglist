package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开启了Spring的组件扫描和Spring Boot的自动配置功能
//@Configuration,@EnableAutoConfiguration,@ComponentScan
public class ReadinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadinglistApplication.class, args);
	}
}
