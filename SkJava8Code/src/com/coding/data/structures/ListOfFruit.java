package com.coding.data.structures;

import java.util.Arrays;
import java.util.List;

public class ListOfFruit {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Mango", "Papaya", "Grapes");
		fruits.forEach(fruit -> System.out.println(fruit));
	}

}
