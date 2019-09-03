package com.master.spring.spring2proj3.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.master.spring.spring2proj3.cdi" })
@SpringBootApplication
public class Spring2proj3CdiApplication {

//	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj3CdiApplication.class);

	/**
	 * Commented for maven build (two main methods in one application)
	 */
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(Spring2proj3CdiApplication.class, args);
//
//		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
//
//		LOGGER.info("{} - {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
//	}

}
