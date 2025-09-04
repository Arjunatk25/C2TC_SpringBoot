package com.tnsif.springboot_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class product {
  private int id ;
  private String name;
  
  
  product()
  {
	  System.out.println("Product obj is created");
  }
  
  public String jeeva()
  {
	  return "jeeva";
  }
}
