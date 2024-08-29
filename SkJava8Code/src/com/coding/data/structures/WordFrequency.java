package com.coding.data.structures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana", "kiwi", "kiwi");

        // Count frequency of each word
        Map<String, Long> frequencyMap = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sort by frequency in descending order and print
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
