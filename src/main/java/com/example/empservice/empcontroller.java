package com.example.empservice;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empcontroller {

	@RequestMapping(value="/edetails",method=RequestMethod.GET,produces="application/json")
	public ebean myindex()
	{	ebean e1= new ebean("tarun",36, "Delhi");
		return e1;
	}
	
}
