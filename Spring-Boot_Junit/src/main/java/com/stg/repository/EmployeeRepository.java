package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
