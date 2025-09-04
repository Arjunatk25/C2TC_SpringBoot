package com.tnsif.SpringBoot_IOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootIocApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringBootIocApplication.class, args);
		
         ConfigurableApplicationContext var = SpringApplication.run(SpringBootIocApplication.class, args);
		
		Shop s1=var.getBean(Shop.class);
		
		s1.ordering();
		
		customerone c1=var.getBean(customerone.class);
		
		c1.order();
	}

}
