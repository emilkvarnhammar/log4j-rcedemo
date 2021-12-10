package com.hackable.log4jrcedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Log4jRcedemoApplication {

	public static void main(String[] args) {
		System.out.println("log4j2.formatMsgNoLookups property value: " + System.getProperty("log4j2.formatMsgNoLookups"));
		SpringApplication.run(Log4jRcedemoApplication.class, args);
	}

}
