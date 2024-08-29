package com.coding.number;

public class FindArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Is Armstrong Number : " + isArmstrongNumberByJava8(371));
	}

	private static boolean isArmstrongNumberByJava8(int n) {
		int len = String.valueOf(n).length();
		int sum = String.valueOf(n).chars().map(ch -> Character.digit(ch, 10)).map(digit -> (int) Math.pow(digit, len))
				.sum();
		return sum == n;

	}

}
