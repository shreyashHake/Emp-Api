package com.shreyash.employeemanagmentproject.repository;

import com.shreyash.employeemanagmentproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
