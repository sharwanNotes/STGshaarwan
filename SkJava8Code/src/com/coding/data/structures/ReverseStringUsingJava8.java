package com.coding.data.structures;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {
	public static void main(String[] args) {
		String original = "SharwnKumar!";
		String reversed = reverseString(original);
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
	}

	public static String reverseString(String input) {
		return IntStream.rangeClosed(1, input.length()).mapToObj(i -> input.charAt(input.length() - i))
				.map(String::valueOf).collect(Collectors.joining());

	}
}
