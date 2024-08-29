package com.coding.data.structures;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindPairsWithSumAndIndices {
	public static void main(String[] args) {
        int[] numbers = {0, 14, 0, 4, 7, 8, 3, 5, 7};
        int targetSum = 11;

        findPairsWithSum(numbers, targetSum);
    }

    public static void findPairsWithSum(int[] numbers, int targetSum) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<String> foundPairs = new HashSet<>();

        IntStream.range(0, numbers.length)
                 .forEach(i -> {
                     int number = numbers[i];
                     int complement = targetSum - number;

                     if (seenNumbers.contains(complement)) {
                         IntStream.range(0, numbers.length)
                                  .filter(j -> numbers[j] == complement && j != i)
                                  .findFirst()
                                  .ifPresent(j -> {
                                      String pair = Math.min(number, complement) + "," + Math.max(number, complement);
                                      if (!foundPairs.contains(pair)) {
                                          foundPairs.add(pair);
                                          System.out.println("Pair: (" + number + ", " + complement + ") with indices: (" + i + ", " + j + ")");
                                      }
                                  });
                     }

                     seenNumbers.add(number);
                 });
    }
}
