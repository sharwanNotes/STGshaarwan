package com.coding.character;

import java.util.stream.Stream;

public class AppendCharInChar {

	public static void main(String[] args) {
		Stream<Character> charStream = Stream.of('A', 'B', 'C');
		charStream.forEach(ch -> {
			char newChar = (char) (ch + 23);
			System.out.println(ch + "_" + newChar);
		});
	}

}
