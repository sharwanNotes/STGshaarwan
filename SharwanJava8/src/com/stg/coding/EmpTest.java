package com.stg.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpTest {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "Amit", 30, "Pune", 2100, "Male", "Developer"),
				new Employee(2, "Ravi", 25, "Mumbai", 2500, "Male", "Finance"),
				new Employee(3, "Sneha", 28, "Bangalore", 2700, "Female", "Engineering"),
				new Employee(4, "Priya", 32, "Delhi", 3000, "Female", "Marketing"),
				new Employee(5, "Arun", 27, "Hyderabad", 2200, "Male", "Sales"),
				new Employee(3, "Suman", 28, "Bangalore", 2700, "Female", "Engineering"));

// Calculate average age of male and female employees
		Map<String, Double> avgSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);

// Find the senior female employee and print the result in one line
		String seniorFemaleEmployee = empList.stream().filter(e -> "Female".equals(e.getGender()))
				.max(Comparator.comparingInt(Employee::getAge)).map(Employee::getName).get();
		System.out.println(seniorFemaleEmployee);

// Find employees with salary between 400,000 and 500,000, sort by salary, and collect names
		String collect = empList.stream().filter(e -> e.getSalary() >= 2500 && e.getSalary() <= 3000)
				.sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getName)
				.collect(Collectors.joining(", "));
		System.out.println(collect);

// Print the employee name who is getting second heigest salary

		Employee employee = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(employee);

// Group employees by their department

		Map<String, List<Employee>> employeeByDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		employeeByDepartment.forEach((dept, emp) -> {
			System.out.println("Department: " + dept);
			emp.forEach(System.out::println);
		});

// Print names of the top 3 highest-paid employees
		empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
				.forEach(e -> System.out.println(e.getName()));

// average salary of employees in a specific department
		double averageSalary = empList.stream().filter(e -> "Engineering".equals(e.getDepartment()))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average Salary in Engineering: " + averageSalary);

// Print list of employee names sorted alphabetically.
		List<String> sortedEmployeeNames = empList.stream().map(Employee::getName).sorted()
				.collect(Collectors.toList());
		sortedEmployeeNames.forEach(System.out::println);
// Print the number of employees in each department.
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.forEach((dept, count) -> System.out.println("Department: " + dept + " has " + count + " employees"));

//Print the names of employees who have a salary >=2500
		empList.stream().filter(e -> e.getSalary() >= 2700).map(Employee::getName).forEach(System.out::println);

//Check if there is any employee with a salary <=3000
		boolean hasHighSalaryEmployee = empList.stream().anyMatch(e -> e.getSalary() <= 2000);
		System.out.println("employee has a salary <= 2000  : " + hasHighSalaryEmployee);

// Print the names of employees who are older than 27 and are from a specific city
		empList.stream().filter(e -> e.getAge() > 27).filter(e -> "Bangalore".equals(e.getCity()))
				.map(Employee::getName)
				.forEach(name -> System.out.println("Employee older than 27 and from Bangalore: " + name));
//Print the average age of employees in each department.
		Map<String, Double> averageAgeByDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));

		averageAgeByDepartment
				.forEach((dept, avgAge) -> System.out.println(dept + ": has an average age of :" + avgAge));

	}
}
