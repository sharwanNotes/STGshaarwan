package com.coding.character;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class CountVowels {

	public static void main(String[] args) {
		 String text = "string data to count each character";
			// Define a Predicate for vowels
		        Predicate<Character> isVowel = c -> "AEIOUaeiou".indexOf(c) != -1;

		        // Define a Map to store counts for each vowel
		        Map<Character, Long> vowelCountMap = new HashMap<>();
		        for (char c : "AEIOUaeiou".toCharArray()) {
		            vowelCountMap.put(c, 0L);
		        }

		        // Count each vowel separately
		        text.chars()
		            .mapToObj(c -> (char) c)
		            .filter(isVowel)
		            .forEach(c -> vowelCountMap.put(c, vowelCountMap.get(c) + 1));

		        // Print the counts of each vowel
		        System.out.println("Vowel counts:");
		        vowelCountMap.forEach((vowel, count) -> System.out.println(vowel + ": " + count));
		}
	}


