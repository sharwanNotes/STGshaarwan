package com.coding.character;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String inputString = "string Stream API is very good concept".replaceAll("\\s+", "").toLowerCase();

		Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstNonRepeatedChar = charCountMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).findFirst().get();

		System.out.println(firstNonRepeatedChar);
	}

}
