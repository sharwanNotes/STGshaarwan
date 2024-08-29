package com.stg.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArrayAddition {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 7, 9, 1, 2, 3, 4, 6 };
		int[] arr2 = { 1, 3, 6, 8, 9, 6, 5, 4, 3 };
		if (arr1.length != arr2.length) {
			throw new IllegalArgumentException("both must be same length");
		}
		int[] resultArray = IntStream.range(0, arr1.length).map(i -> arr1[i] + arr2[i]).toArray();
		System.out.println(Arrays.toString(resultArray));
	}

}
