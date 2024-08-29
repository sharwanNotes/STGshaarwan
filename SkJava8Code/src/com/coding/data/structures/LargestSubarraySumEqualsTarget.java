package com.coding.data.structures;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarraySumEqualsTarget {

	public static void main(String[] args) {
		int[] arr = { 15, 4, -2, 2, -3, 1, 3, 3, 0 };
		int targetSum = 4;

		int maxLength = findMaxLength(arr, targetSum);
		System.out.println("Length of the largest subarray with sum " + targetSum + ": " + maxLength);
	}

	public static int findMaxLength(int[] arr, int targetSum) {
		Map<Integer, Integer> sumToIndex = new HashMap<>();
		sumToIndex.put(0, -1); // Initialize with sum 0 at index -1 (before start)

		int maxLength = 0;
		int currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			// Check if there exists a subarray with sum (currentSum - targetSum)
			if (sumToIndex.containsKey(currentSum - targetSum)) {
				int startIndex = sumToIndex.get(currentSum - targetSum);
				int length = i - startIndex;
				maxLength = Math.max(maxLength, length);
			}

			// Store the first occurrence of currentSum if not already present
			if (!sumToIndex.containsKey(currentSum)) {
				sumToIndex.put(currentSum, i);
			}
		}

		return maxLength;
	}
}
