package com.stg.coding;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyCompanyReverseString {

	public static void main(String[] args) {
		String original = "I will be rich in 2024";
		String reversed = reverseString(original);
		System.out.println(reversed);
	}

	private static String reverseString(String original) {
		return IntStream.rangeClosed(1, original.length()).mapToObj(i -> original.charAt(original.length() - i))
				.map(String::valueOf).collect(Collectors.joining());
	}

}
