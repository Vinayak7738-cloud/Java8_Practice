package com.practice.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// Java 8 program to print even numbers from a List
public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,4,8,40,11,22,33,99);
		
		List<Integer> evenNumbers = numbers.stream()
										.filter(e -> e % 2 == 0)
											.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
	}

}
