package com.master.spring.spring2proj3.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj3.cdi.SomeCdiBusiness;

@ComponentScan(basePackages = { "com.master.spring.spring2proj3.cdi" })
@SpringBootApplication
public class Spring2proj3CdiApplication2 {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj3CdiApplication2.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj3CdiApplication2.class, args);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{}", someCdiBusiness);
	}

}
