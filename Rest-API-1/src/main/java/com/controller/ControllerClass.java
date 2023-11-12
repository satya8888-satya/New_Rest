package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	 @RequestMapping("/hello")
	 public String home() {
	 System.out.println("The Chatrapathi Shivaji Maharaj");
	return null;
	 }
	 
	
	

}
