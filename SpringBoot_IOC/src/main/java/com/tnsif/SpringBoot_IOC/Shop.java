package com.tnsif.SpringBoot_IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {
	// Auto wire for creating obj within another class?
	@Autowired
   private 	 customerone customer1;
	@Autowired
   private 	 customertwo customer2;
	@Autowired
   private 	 customerthree  customer3;
	
	
	
	public Shop() {
		System.out.println("Shop constructor");
		
		
	}



	public void ordering() {
		customer1.order();
		customer2.order();
		customer3.order();
	}
}
