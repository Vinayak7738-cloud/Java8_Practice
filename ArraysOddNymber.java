package com.practice.java8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysOddNymber {

	public static void main(String[] args) {
		
		int[] numbers = {1,4,8,40,11,22,33,99};
		
		Arrays.stream(numbers).filter(e -> e % 2 != 0 )
								.forEach(System.out :: println);

	}

}
