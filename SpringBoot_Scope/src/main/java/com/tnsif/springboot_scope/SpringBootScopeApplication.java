package com.tnsif.springboot_scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringBootScopeApplication.class, args);
		
		product p1= var.getBean(product.class);
		String s1 = p1.jeeva();
		System.out.println(s1);
	
		SpringBootScopeApplication.hem();
	
	}
	
	public static void hem()
	{
		System.out.println("inside hem");
	}

}
