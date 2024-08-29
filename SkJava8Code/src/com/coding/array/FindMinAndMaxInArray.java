package com.coding.array;

import java.util.Arrays;

public class FindMinAndMaxInArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 22, 11, 33, 5 };
		int max = Arrays.stream(a).boxed().max(Integer::compareTo).get();
		System.out.println("Max Value : " + max);
		int min = Arrays.stream(a).boxed().min(Integer::compareTo).get();
		System.out.println("Min Value: " + min);
	}

}
