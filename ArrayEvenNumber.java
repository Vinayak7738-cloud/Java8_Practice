package com.practice.java8.streams;

import java.util.Arrays;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,7,8,1,22,4,3,77,66};
		
		Arrays.stream(numbers).filter(e -> e % 2 == 0)
									.forEach(System.out :: println);

	}

}
