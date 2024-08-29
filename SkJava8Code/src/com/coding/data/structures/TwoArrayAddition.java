package com.coding.data.structures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArrayAddition {

	public static void main(String[] args) {
		 int[] array1 = {8, 5, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};

	        if (array1.length != array2.length) {
	            throw new IllegalArgumentException("Both arrays must have the same length.");
	        }

	        int[] resultArray = IntStream.range(0, array1.length)
	                .map(i -> array1[i] + array2[i])
	                .toArray();

	        System.out.println("Array 1: " + Arrays.toString(array1));
	        System.out.println("Array 2: " + Arrays.toString(array2));
	        System.out.println("Result Array: " + Arrays.toString(resultArray));
	    }

}
