package com.coding.jdk8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // Create Optionals
        Optional<String> optionalWithValue = Optional.of("Hello");
        Optional<String> optionalWithNull = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();

        // Demonstrating empty()
        System.out.println("Empty Optional: " + emptyOptional);

        // Demonstrating of()
        System.out.println("Optional with value: " + optionalWithValue);

        // Demonstrating ofNullable()
        System.out.println("Optional with nullable value: " + optionalWithNull);

        // Demonstrating isPresent()
        System.out.println("Is optionalWithValue present? " + optionalWithValue.isPresent());
        System.out.println("Is optionalWithNull present? " + optionalWithNull.isPresent());

        // Demonstrating ifPresent()
        optionalWithValue.ifPresent(value -> System.out.println("Value is: " + value));

        // Demonstrating get()
        System.out.println("Value from optionalWithValue: " + optionalWithValue.get());

        // Demonstrating orElse()
        System.out.println("Value from optionalWithNull or default: " + optionalWithNull.orElse("Default Value"));

        // Demonstrating orElseGet()
        System.out.println("Value from optionalWithNull or generated default: " + optionalWithNull.orElseGet(() -> "Generated Default"));

        // Demonstrating orElseThrow()
        try {
            System.out.println("Value from optionalWithValue or exception: " + optionalWithValue);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // Demonstrating orElseThrow() with exception supplier
        try {
            System.out.println("Value from optionalWithNull or exception: " + optionalWithNull.orElseThrow(() -> new RuntimeException("No value present")));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Demonstrating map()
        Optional<Integer> length = optionalWithValue.map(String::length);
        System.out.println("Length of value: " + length.orElse(null));

        // Demonstrating flatMap()
        Optional<String> upperCase = optionalWithValue.flatMap(value -> Optional.of(value.toUpperCase()));
        System.out.println("Upper case value: " + upperCase.orElse(null));

        // Demonstrating filter()
        Optional<String> filtered = optionalWithValue.filter(value -> value.length() > 5);
        System.out.println("Filtered value (length > 5): " + filtered.orElse("Not filtered"));

        // Demonstrating toString()
        System.out.println("String representation of optionalWithValue: " + optionalWithValue.toString());

        // Demonstrating hashCode()
        System.out.println("Hash code of optionalWithValue: " + optionalWithValue.hashCode());

        // Demonstrating equals()
        System.out.println("Is optionalWithValue equal to another optional with same value? " + optionalWithValue.equals(Optional.of("Hello")));
    }
}
