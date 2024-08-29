package com.coding.data.structures;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void main(String[] args) {
        String strSentence = " HI EPAM bYe EPAM goodbye EPAM welcome ePAM Hi There epAM BYE bye EPaM";
        
        // Normalize the string by converting to lowercase and trimming extra spaces
        String[] words = strSentence.toLowerCase().trim().split("\\s+");

        // Count occurrences of each word
        Map<String, Long> wordCounts = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter words that occur more than once
        Map<String, Long> duplicates = wordCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Print the result
        System.out.println("Words occurring more than once:");
        duplicates.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
