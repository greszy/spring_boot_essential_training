package com.gregoryszymanski.bootingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication defines BootingWebApplication as the root package for configuration via component scanning as well as bean configurations that are defined within it.
//@SporingBootApplication includes the behavior of @EnableAutoConfiguration
@SpringBootApplication
public class BootingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootingWebApplication.class, args);
	}

}
