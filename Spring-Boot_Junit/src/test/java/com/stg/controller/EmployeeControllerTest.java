package com.stg.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.stg.entity.Employee;
import com.stg.service.EmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void testAddEmployee() throws Exception {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        when(employeeService.addEmployee(any(Employee.class))).thenReturn(employee);

        mockMvc.perform(post("/api/employees")
                .contentType("application/json")
                .content("{\"empId\":1, \"firstName\":\"John\", \"lastName\":\"Doe\", \"email\":\"john.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value("John"));
    }

    @Test
    public void testGetEmployee() throws Exception {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        when(employeeService.getEmployee(anyInt())).thenReturn(Optional.of(employee));

        mockMvc.perform(get("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value("John"));
    }

    @Test
    public void testUpdateEmployee() throws Exception {
        Employee existingEmployee = new Employee(1, "John", "Doe", "john.doe@example.com");
        Employee updatedEmployee = new Employee(1, "Jane", "Doe", "jane.doe@example.com");
        when(employeeService.getEmployee(anyInt())).thenReturn(Optional.of(existingEmployee));
        when(employeeService.updateEmployee(any(Employee.class))).thenReturn(updatedEmployee);

        mockMvc.perform(put("/api/employees/1")
                .contentType("application/json")
                .content("{\"firstName\":\"Jane\", \"lastName\":\"Doe\", \"email\":\"jane.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value("Jane"));
    }

    @Test
    public void testDeleteEmployee() throws Exception {
        when(employeeService.getEmployee(anyInt())).thenReturn(Optional.of(new Employee()));

        mockMvc.perform(delete("/api/employees/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void testListAllEmployees() throws Exception {
        Employee employee1 = new Employee(1, "John", "Doe", "john.doe@example.com");
        Employee employee2 = new Employee(2, "Jane", "Doe", "jane.doe@example.com");
        when(employeeService.listAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].firstName").value("John"))
                .andExpect(jsonPath("$[1].firstName").value("Jane"));
    }
}

