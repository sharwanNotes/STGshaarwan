package com.coding.array;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		int[] array = { 111, 222, 333, 111, 555, 333, 777, 222 };
		int[] distinctArray = Arrays.stream(array).distinct().toArray();
		System.out.println("Array with duplicates removed: " + Arrays.toString(distinctArray));
	}

}
