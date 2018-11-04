package com.mx.blog.ownerblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mx.blog.ownerblog.dao.mapper"})
public class OwnerblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnerblogApplication.class, args);
	}
}
