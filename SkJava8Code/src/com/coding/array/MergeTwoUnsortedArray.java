package com.coding.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 7, 1 };
		int[] b = new int[] { 8, 3, 9, 5 };
		int[] concat = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(concat));

	}

}
