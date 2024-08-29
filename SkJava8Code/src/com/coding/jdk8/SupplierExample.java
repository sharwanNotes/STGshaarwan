package com.coding.jdk8;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to generate a random integer between 1 and 100
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100) + 1;
        
        // Get a random integer using the supplier
        Integer randomNumber = randomIntegerSupplier.get();
        
        System.out.println("Random number: " + randomNumber);
    }
}
