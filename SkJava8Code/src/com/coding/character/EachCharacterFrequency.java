package com.coding.character;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterFrequency {

	public static void main(String[] args) {
		String str = "Sachin Tendulkar from Mumbai Sachin sachin sachin sachin";
		List<String> strList = Arrays.asList(str.split(""));
		Map<String, Long> frequencyList = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		frequencyList.forEach((k, v) -> System.out.println("Character: " + k + ", Count: " + v));
	}

}
