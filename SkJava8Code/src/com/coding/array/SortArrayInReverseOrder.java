package com.coding.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayInReverseOrder {

	public static void main(String[] args) {
		int arr[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		List<Integer> collect = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted array in reverse order: " + collect);
	}

}
