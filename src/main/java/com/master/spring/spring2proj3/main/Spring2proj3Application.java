package com.master.spring.spring2proj3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj3.res.BinarySearchImpl;

@ComponentScan(basePackages = { "com.master.spring.spring2proj3.res" })
@SpringBootApplication
public class Spring2proj3Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj3Application.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result1 = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 2);
		System.out.println(result1);
	}

}
