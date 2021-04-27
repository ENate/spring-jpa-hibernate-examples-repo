package com.minejava.jpathymleafwebexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.minejava.jpathymleafwebexample"})
@EnableJpaRepositories(basePackages="com.minejava.jpathymleafwebexample.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "com.minejava.jpathymleafwebexample.entity")
public class JpaThymleafWebExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaThymleafWebExampleApplication.class, args);
	}

}
