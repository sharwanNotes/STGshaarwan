package com.coding.data.structures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard {

	public static void main(String[] args) {
		String str = "DDYPK7188F";
		if (str.length() == 10) {
			Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches())
				System.out.println("valid pan");
			else
				System.out.println("not valid pan");
		} else {
			System.out.println("not valid");
		}
	}

}
