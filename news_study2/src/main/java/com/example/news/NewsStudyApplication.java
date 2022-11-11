package com.example.news;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.news.dao")
public class NewsStudyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NewsStudyApplication.class, args);
	}

}
