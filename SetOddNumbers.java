package com.practice.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetOddNumbers {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		numbers.addAll(Arrays.asList(new Integer[] {1,4,8,40,11,22,33,99}));
		
		Set<Integer> oddNumbersSet = numbers.stream()
										.filter(e -> e % 2 != 0)
											.collect(Collectors.toSet());
		
		System.out.println(oddNumbersSet);
		

	}

}
