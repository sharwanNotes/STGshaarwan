package com.coding.string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		String input = "JavaAPI";
		List<Character> duplicateList = input.chars().mapToObj(x -> Character.toUpperCase((char) x))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1L).map(Entry::getKey).collect(Collectors.toList());

		System.out.println(duplicateList);
	}

}
