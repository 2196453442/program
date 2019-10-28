package com.dzkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.dzkj.mapper")
public class start {
public static void main(String[] args) {
	SpringApplication.run(start.class, args);
	
}
}
