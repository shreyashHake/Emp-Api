package com.shreyash.employeemanagmentproject.repository;

import com.shreyash.employeemanagmentproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
