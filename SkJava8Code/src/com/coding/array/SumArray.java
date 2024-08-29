package com.coding.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumArray {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		  int sumValue = Arrays.stream(a).boxed().collect(Collectors.summingInt(Integer::intValue));
		  System.out.println(sumValue);
	}

}
