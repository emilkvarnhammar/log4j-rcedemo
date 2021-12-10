package com.hackable.log4jrcedemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import java.io.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
public class HelloController {
	private static final Logger LOGGER = LogManager.getLogger();

	@RequestMapping("/sayhello")
	public String sayHello(@RequestParam String name) {
        LOGGER.info("Sending hello to user: {}", name);
        return "Hello there!";
	}
}