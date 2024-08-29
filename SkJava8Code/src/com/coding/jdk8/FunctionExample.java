package com.coding.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        
        // Function to convert a string to uppercase
        Function<String, String> toUpperCaseFunction = String::toUpperCase;
        
        // Apply the function to each element in the list
        List<String> upperCaseStrings = strings.stream()
                                                .map(toUpperCaseFunction)
                                                .collect(Collectors.toList());
        
        System.out.println(upperCaseStrings); // Output: [HELLO, WORLD, JAVA, STREAMS]
    }
}

