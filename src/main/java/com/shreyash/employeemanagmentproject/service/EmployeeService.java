package com.shreyash.employeemanagmentproject.service;


import com.shreyash.employeemanagmentproject.entity.Employee;
import com.shreyash.employeemanagmentproject.records.NewEmployeeRequest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {
   List<Employee> getAllEmployee();

   void addEmployee(NewEmployeeRequest newEmployeeRequest);

   void updateEmployee(Integer empId, NewEmployeeRequest newEmployeeRequest);
}
