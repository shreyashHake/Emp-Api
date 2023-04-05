package com.shreyash.employeemanagmentproject.controller;

import com.shreyash.employeemanagmentproject.entity.Employee;
import com.shreyash.employeemanagmentproject.records.NewEmployeeRequest;
import com.shreyash.employeemanagmentproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmplyoeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/post")
    public String addEmployee(@RequestBody NewEmployeeRequest newEmployeeRequest){
        employeeService.addEmployee(newEmployeeRequest);
        return "Employee data Added Successfully!";
    }

}
