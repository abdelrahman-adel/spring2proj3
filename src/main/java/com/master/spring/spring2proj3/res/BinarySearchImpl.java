package com.master.spring.spring2proj3.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numToSearchFor) {
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		// search logic
		return 2;
	}
}
