package com.coding.array;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 2, 12, 34, 2, 11, 5, 12 };
		Set<Integer> duplicates = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println("Duplicates: " + duplicates);

	}

}
