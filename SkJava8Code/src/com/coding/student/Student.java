package com.coding.student;

public class Student {
	 private String name;
	    private int age;
	    private String grade;

	    // Constructor
	    public Student(String name, int age, String grade) {
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    // toString method for easy printing
	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", grade='" + grade + '\'' +
	                '}';
	    }
}
