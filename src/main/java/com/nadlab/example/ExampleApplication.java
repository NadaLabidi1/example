package com.nadlab.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);
        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOsName());
		System.out.println(myFirstService.getProperty());
	}

}
