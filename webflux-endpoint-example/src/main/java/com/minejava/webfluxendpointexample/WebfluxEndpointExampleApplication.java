package com.minejava.webfluxendpointexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxEndpointExampleApplication {
	private static final Logger logger = LoggerFactory.getLogger(WebfluxEndpointExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebfluxEndpointExampleApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		// System.out.println(gwc.getResult());
		logger.info("The result is: {}", gwc.getResult());
	}
}
