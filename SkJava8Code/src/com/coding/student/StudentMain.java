package com.coding.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", 14, "8th"), new Student("Bob", 13, "8th"),
				new Student("Charlie", 15, "9th"), new Student("David", 14, "9th"), new Student("Eve", 13, "8th"));

		Map<String, Double> averageAges = students.stream()
				.collect(Collectors.groupingBy(Student::getGrade, Collectors.averagingInt(Student::getAge)));

		averageAges.forEach((grade, avgAge) -> System.out.println("Grade: " + grade + ", Average Age: " + avgAge));
	}

}
