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
    public String addEmployee(@RequestBody NewEmployeeRequest newEmployeeRequest) {
        employeeService.addEmployee(newEmployeeRequest);
        return "Employee data Added Successfully!";
    }

    @PutMapping("/update/{empId}")
    public String updateEmployee(
            @PathVariable("empId") Integer empId,
            @RequestBody NewEmployeeRequest newEmployeeRequest
    ) {
        employeeService.updateEmployee(
                empId,
                newEmployeeRequest
        );

        return "Employee with Id " + empId + " is updated!";
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployeById(@PathVariable("empId") Integer empId) {
        employeeService.deleteEmployeById(empId);
        return "Employee wit + " + empId + " was Successful!";
    }
}
