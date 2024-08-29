package com.coding.array;

import java.util.Arrays;

public class FindSumAndAverageInArray {

	public static void main(String[] args) {
		int[] arr = { 45, 12, 56, 15, 24, 75, 31, 89 };
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		double average = Arrays.stream(arr).average().getAsDouble();
		System.out.println(average);
	}

}
