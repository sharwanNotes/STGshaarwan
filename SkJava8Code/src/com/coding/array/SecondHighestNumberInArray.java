package com.coding.array;

import java.util.Arrays;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int[] array = { 5, 10, 3, 8, 15, 7, 9 };
		Integer secondHighestNumber = Arrays.stream(array).boxed().sorted((a, b) -> Integer.compare(b, a)).skip(1)
				.findFirst().get();
		System.out.println("Second highest number: " + secondHighestNumber);
	}

}
