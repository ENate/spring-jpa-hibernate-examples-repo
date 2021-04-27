package com.minejava.webfluxendpointexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxEndpointExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxEndpointExampleApplication.class, args);


	GreetingWebClient gwc = new GreetingWebClient();
	System.out.println(gwc.getResult());
}
}
