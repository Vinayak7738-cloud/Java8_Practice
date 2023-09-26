package com.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Java 8 program to print odd numbers from a List
public class OddNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,4,8,40,11,22,33,99);
		
		List<Integer> oddNumbers = numbers.stream()
									.filter(e -> e % 2 != 0)	
										.collect(Collectors.toList());
		
		System.out.println(oddNumbers);
	}

}
