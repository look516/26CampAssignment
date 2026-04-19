package com.sparta.miniorder.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//[Temp] product 인식하기 위해 basePackages 변경
// 추후 API 분리하거나, gateway 사용할 예정
@ComponentScan(basePackages = "com.sparta.miniorder")
@EntityScan(basePackages = "com.sparta.miniorder")
@EnableJpaRepositories(basePackages = "com.sparta.miniorder")
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}