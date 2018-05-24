package com.example.FirstWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstWebApplication {
	@Autowired
	ApplicationContext context;
	
	@Bean
	public CommandLineRunner runner() {
		return (args) -> {
			int count = context.getBeanDefinitionCount();
	        System.out.println("Beans的个数：" + count);
	        String[] names = context.getBeanDefinitionNames();
	        for (String name : names) {
	        		System.out.printf("%s -> %s\n", name, context.getBean(name));
	        }
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstWebApplication.class, args);
		
			
	}
}
