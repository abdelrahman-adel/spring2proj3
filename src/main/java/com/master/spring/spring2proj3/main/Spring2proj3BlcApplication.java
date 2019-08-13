package com.master.spring.spring2proj3.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj3.blc.BinarySearchImpl;

@ComponentScan(basePackages = { "com.master.spring.spring2proj3.blc" })
@SpringBootApplication
public class Spring2proj3BlcApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj3BlcApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj3BlcApplication.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result1 = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 2);
		LOGGER.info("result: {}", result1);
	}

}
