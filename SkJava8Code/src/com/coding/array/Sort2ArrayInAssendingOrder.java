package com.coding.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort2ArrayInAssendingOrder {

	public static void main(String[] args) {
		int i[] = { 4, 5, 13, 22 };
		int j[] = { 0, 9, 3, 7, 12, 11 };
		List<Integer> collect = Stream.concat(Arrays.stream(i).boxed().sorted(), Arrays.stream(j).boxed().sorted())
				.collect(Collectors.toList());

		System.out.println(collect);
	}

}
