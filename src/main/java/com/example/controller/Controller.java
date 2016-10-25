package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class Controller {
	
	@RequestMapping(value="/", method=RequestMethod.GET )
    public String monitoring() 	
	{
		return "OK";
	
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String Test()
	{
		System.out.println("Inside test controller");
		
		return "SK-Test successfull";
	}

}
