package com.conposition.mybatis.mybatisspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.conposition.mybatis.mybatisspringboot.dao")
public class MybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringbootApplication.class, args);
	}

}
