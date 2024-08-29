package com.stg.coding;

class Employee {
	private int id;
	private String name;
	private int age;
	private String city;
	private double salary;
	private String gender;
	private String department;

	public Employee(int id, String name, int age, String city, double salary, String gender, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary
				+ ", gender=" + gender + ", department=" + department + "]";
	}

}
