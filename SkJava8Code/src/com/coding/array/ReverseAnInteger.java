package com.coding.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 7, 3, 9, 6 };
		int[] reversedArray = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		Arrays.stream(reversedArray).forEach(num -> System.out.print(num + " "));

	}

}
