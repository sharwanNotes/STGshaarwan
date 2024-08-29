package com.coding.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPrimeNumberByJava8 {

		private static boolean isPrime(int number) {
			return number > 1 && IntStream.range(2, number / 2).noneMatch(i -> number % i == 0);
		}

		public static void main(String[] args) {
			List<Integer> numList = Arrays.asList(11, 14, 2, 5, 4, 9, 6, 45, 67, 78, 90, 50, 55, 34, 89);
			List<Integer> primeNumbers = numList.stream().filter(m -> isPrime(m)).collect(Collectors.toList());
			System.out.println(primeNumbers);
		}
}
