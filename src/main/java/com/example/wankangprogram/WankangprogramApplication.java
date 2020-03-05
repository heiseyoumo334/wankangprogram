package com.example.wankangprogram;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.example.wankangprogram.mapper")
@EnableAsync
@EnableCaching
public class WankangprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(WankangprogramApplication.class, args);
	}

}
