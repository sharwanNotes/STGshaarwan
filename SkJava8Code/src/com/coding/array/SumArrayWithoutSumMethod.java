package com.coding.array;

import java.util.Arrays;

public class SumArrayWithoutSumMethod {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		int sum = Arrays.stream(a).boxed().reduce(0, (x, y) -> x + y).intValue();
		System.out.println(sum);
	}

}
