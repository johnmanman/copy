package com.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "com.mapping",
        "com.mapping.one2one.bi",
        "com.mapping.one2one.uni",
        "com.mapping.one2many.bi",
        "com.mapping.one2many.uni",
    })
@SpringBootApplication
public class MappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

}
