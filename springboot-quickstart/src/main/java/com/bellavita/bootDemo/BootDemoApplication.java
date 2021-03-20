package com.bellavita.bootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
@ComponentScan
@Configuration
public class BootDemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(BootDemoApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
//		SpringApplication.run(BootDemoApplication.class, args);
	}

}
