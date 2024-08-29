package com.coding.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        // Filter the list based on the predicate
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());
        
        System.out.println(evenNumbers); // Output: [2, 4, 6, 8]
    }
}

