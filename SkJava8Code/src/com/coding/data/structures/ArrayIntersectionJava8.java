package com.coding.data.structures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayIntersectionJava8 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int[] result = intersect(nums1, nums2);

		System.out.print("Intersection: ");
		Arrays.stream(result).forEach(num -> System.out.print(num + " "));
		System.out.println();
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		// Count the frequency of each number in nums1
		Map<Integer, Long> numCount1 = Arrays.stream(nums1).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Create a list to collect the intersection elements
		List<Integer> intersection = Arrays.stream(nums2).boxed()
				.filter(num -> numCount1.containsKey(num) && numCount1.get(num) > 0)
				.peek(num -> numCount1.put(num, numCount1.get(num) - 1)).collect(Collectors.toList());

		// Convert the list to an array
		return intersection.stream().mapToInt(Integer::intValue).toArray();
	}
}
