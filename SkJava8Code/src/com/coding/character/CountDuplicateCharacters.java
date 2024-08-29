package com.coding.character;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Sharwan";
		Map<Character, Long> duplicates = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		duplicates.forEach((k, v) -> System.out.println("Character: " + k + ", Count: " + v));
	}

}
