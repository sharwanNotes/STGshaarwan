package com.stg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.stg.entity.Employee;
import com.stg.repository.EmployeeRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        Employee result = employeeService.addEmployee(employee);
        assertEquals(employee, result);
        verify(employeeRepository, times(1)).save(employee);
    }

    @Test
    public void testGetEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        when(employeeRepository.findById(anyInt())).thenReturn(Optional.of(employee));

        Optional<Employee> result = employeeService.getEmployee(1);
        assertTrue(result.isPresent());
        assertEquals(employee, result.get());
    }

    @Test
    public void testUpdateEmployee() {
        Employee existingEmployee = new Employee(1, "John", "Doe", "john.doe@example.com");
        Employee updatedEmployee = new Employee(1, "Jane", "Doe", "jane.doe@example.com");
        when(employeeRepository.findById(anyInt())).thenReturn(Optional.of(existingEmployee));
        when(employeeRepository.save(any(Employee.class))).thenReturn(updatedEmployee);

        Employee result = employeeService.updateEmployee(updatedEmployee);
        assertEquals(updatedEmployee, result);
        verify(employeeRepository, times(1)).save(updatedEmployee);
    }

    @Test
    public void testDeleteEmployee() {
        when(employeeRepository.findById(anyInt())).thenReturn(Optional.of(new Employee()));

        employeeService.deleteEmployee(1);
        verify(employeeRepository, times(1)).deleteById(1);
    }

    @Test
    public void testListAllEmployees() {
        Employee employee1 = new Employee(1, "John", "Doe", "john.doe@example.com");
        Employee employee2 = new Employee(2, "Jane", "Doe", "jane.doe@example.com");
        List<Employee> employees = Arrays.asList(employee1, employee2);
        when(employeeRepository.findAll()).thenReturn(employees);

        List<Employee> result = employeeService.listAllEmployees();
        assertEquals(2, result.size());
        assertEquals(employee1, result.get(0));
        assertEquals(employee2, result.get(1));
    }
}
