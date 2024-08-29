package com.coding.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Consumer to print names with a prefix
        Consumer<String> printWithPrefix = name -> System.out.println("Name: " + name);
        
        // Apply the consumer to each element in the list
        names.forEach(printWithPrefix);
    }
}

