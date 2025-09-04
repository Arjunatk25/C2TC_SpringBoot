package com.tnsif.restApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	
@RequestMapping("/hello")
  public String show()
  {
	  System.out.println("welcome to capgemini");
	  return "welcome to capgemini";
  }
@RequestMapping("/emma")
  public String hello()
  {
	  return "hello";
  }
}
