package com.coding.employee;
import java.time.LocalDate;
public class Employee {
	private int empId;
	private String name;
	private int age;
	private String city;
	private int salary;
	private String department;
	private LocalDate  hireDate;

	public Employee() {
	}

	public Employee(int empId, String name, int age, String city, int salary, String department, LocalDate hireDate) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.department = department;
		this.hireDate = hireDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary
				+ ", department=" + department + ", hireDate=" + hireDate + "]";
	}

}
