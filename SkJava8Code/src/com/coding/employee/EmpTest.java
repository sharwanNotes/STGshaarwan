package com.coding.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "Ramesh", 30, "Pune", 20000, "Developer", LocalDate.of(2010, 3, 06)));
		empList.add(new Employee(5, "Suresh", 40, "Chennai", 40000, "HR", LocalDate.of(2008, 5, 30)));
		empList.add(new Employee(6, "Mahesh", 25, "Bangalore", 60000, "Admin", LocalDate.of(2001, 8, 25)));
		empList.add(new Employee(7, "Sharwan", 31, "Hyderabad", 70000, "Developer", LocalDate.of(2018, 6, 06)));
		empList.add(new Employee(9, "Ravi", 33, "Mumbai", 45000, "Admin", LocalDate.of(2011, 9, 28)));
		empList.add(new Employee(3, "Shyam", 38, "Delhi", 10000, "HR", LocalDate.of(2015, 5, 11)));
		empList.add(new Employee(8, "Aman", 29, "Kolkata", 20000, "Developer", LocalDate.of(2016, 8, 15)));
		empList.add(new Employee(2, "Rajendra", 45, "Bangalore", 50000, "Admin", LocalDate.of(2000, 11, 26)));

		// Find employees whose salary is greater than 45000
		List<Employee> employeesWith45K = empList.stream().filter(e -> e.getSalary() > 45000)
				.collect(Collectors.toList());
		employeesWith45K.forEach(System.out::println);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		// Find employees from a specific city (e.g., Bangalore)
		List<Employee> employeesFromBangalore = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Bangalore"))
				.collect(Collectors.toList());
		employeesFromBangalore.forEach(System.out::println);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		// Group employees by their department
		Map<String, List<Employee>> EmployeeByDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		EmployeeByDepartment.forEach((department, employees) -> {
			System.out.println("Department: " + department);
			employees.forEach(System.out::println);
		});

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");
		// Calculate average salary by department

		Map<String, Double> salaryByDepartment = empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		salaryByDepartment.forEach((department, avgSalary) -> System.out
				.println("Department: " + department + ", Average Salary: " + avgSalary));

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");
		// Find the oldest employee by joining date
		Employee oldestEmployee = empList.stream().min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
				.orElse(null);
		System.out.println("oldestEmployee" + oldestEmployee);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		// Find employees within a specific age range (e.g., 30 to 40)
		List<Employee> employeeWith30to40Age = empList.stream().filter(e -> e.getAge() >= 30 && e.getAge() <= 40)
				.collect(Collectors.toList());
		employeeWith30to40Age.forEach(System.out::println);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");
		// Count employees by their department
		Map<String, Long> employeeCountByDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		employeeCountByDepartment
				.forEach((department, count) -> System.out.println("Department: " + department + ", Count: " + count));

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		Optional<Employee> thirdHighestSalaryEmployee = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
		thirdHighestSalaryEmployee.ifPresent(employee -> System.out.println(
				"Employee with Third Highest Salary: " + employee.getName() + ", Salary: " + employee.getSalary()));

	}

}
