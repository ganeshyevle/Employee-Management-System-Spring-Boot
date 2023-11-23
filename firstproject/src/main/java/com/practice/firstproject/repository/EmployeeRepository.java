package com.practice.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

