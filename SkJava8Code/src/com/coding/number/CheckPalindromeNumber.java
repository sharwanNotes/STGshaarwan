package com.coding.number;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		System.out.println(" Is Palindrome No : " + isPalindromeNumberByJava8(16461));

	}

	private static boolean isPalindromeNumberByJava8(int number) {
		String numStr = String.valueOf(number);
		return numStr.equals(new StringBuilder(numStr).reverse().toString());
	}

}
