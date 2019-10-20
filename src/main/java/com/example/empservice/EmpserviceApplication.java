package com.example.empservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;


//@EnableEurekaClient
@SpringBootApplication
public class EmpserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpserviceApplication.class, args);
	}

}
