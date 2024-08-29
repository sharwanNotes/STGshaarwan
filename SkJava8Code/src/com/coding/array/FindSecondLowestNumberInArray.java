package com.coding.array;

import java.util.Arrays;

public class FindSecondLowestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 32, 1, 8, 5, 31, 22 };
		Integer secondLowestNumberInArray = Arrays.stream(arr).boxed().sorted().skip(1).findAny().get();
		System.out.println(" Second Lowest Number In this Array : " + secondLowestNumberInArray);
	}

}
