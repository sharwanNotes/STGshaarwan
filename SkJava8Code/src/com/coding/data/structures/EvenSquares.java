package com.coding.data.structures;

import java.util.Arrays;

public class EvenSquares {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Arrays.stream(numbers).filter(n -> n % 2 == 0) // Filter even numbers
				.map(n -> n * n) // Square each even number
				.forEach(System.out::println); // Print each squared number
	}

}
