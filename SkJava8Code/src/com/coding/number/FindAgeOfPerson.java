package com.coding.number;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeOfPerson {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1994, 01, 06);
        LocalDate today = LocalDate.now();
         
        System.out.println(ChronoUnit.YEARS.between(birthDay, today));

	}

}
