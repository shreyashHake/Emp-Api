package com.shreyash.employeemanagmentproject.service;

import com.shreyash.employeemanagmentproject.entity.Department;
import com.shreyash.employeemanagmentproject.records.NewDepartmentRequest;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepartments();

    void addDepartment(NewDepartmentRequest newDepartmentRequest);

    void updateDepartment(Integer depId, NewDepartmentRequest newDepartmentRequest);

    void deleteDepartment(Integer depId);
}
