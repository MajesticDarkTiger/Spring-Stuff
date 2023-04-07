package com.TwoWheelsDown.TWD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.TwoWheelsDown")
public class TwdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwdApplication.class, args);
	}

}
