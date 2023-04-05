package com.shreyash.employeemanagmentproject.controller;

import com.shreyash.employeemanagmentproject.entity.Department;
import com.shreyash.employeemanagmentproject.records.NewDepartmentRequest;
import com.shreyash.employeemanagmentproject.service.DepartmentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/get")
    public List<Department> getAllDepartmentsName(){
        return departmentService.getAllDepartments();
    }

    @PostMapping("/post")
    public String addDepartment(@RequestBody NewDepartmentRequest newDepartmentRequest) {
        departmentService.addDepartment(newDepartmentRequest);
        return "Department added successfully!";
    }

    @PutMapping("/update/{depId}")
    public String updateDepartment(@PathVariable Integer depId, @RequestBody NewDepartmentRequest newDepartmentRequest) {
        departmentService.updateDepartment(depId, newDepartmentRequest);
        return "Deparment with id " + depId + " is updated";
    }

    @DeleteMapping("/delete/{depId}")
    public String deleteDepartment(@PathVariable Integer depId) {
        departmentService.deleteDepartment(depId);
        return "Department deleted with id " + depId;
    }
}
