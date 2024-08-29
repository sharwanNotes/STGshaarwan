package com.coding.string;

public class MyReverseString {

	public static void main(String[] args) {
		String str = "John is a software developer";
		String reverse = "";
		for (int i = 0; i < str.length() - 1; i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println(reverse);
	}
}
