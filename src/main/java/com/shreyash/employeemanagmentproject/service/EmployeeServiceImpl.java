package com.shreyash.employeemanagmentproject.service;

import com.shreyash.employeemanagmentproject.entity.Employee;
import com.shreyash.employeemanagmentproject.records.NewEmployeeRequest;
import com.shreyash.employeemanagmentproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public void addEmployee(NewEmployeeRequest newEmployeeRequest) {
        Employee employee = new Employee(
                newEmployeeRequest.empName(),
                newEmployeeRequest.empEmail(),
                newEmployeeRequest.empAge()
        );
        System.out.println(newEmployeeRequest.toString());
        employeeRepo.save(employee);
    }

    @Override
    public void updateEmployee(Integer empId, NewEmployeeRequest newEmployeeRequest) {
        Optional<Employee> employeeOptional = employeeRepo.findById(empId);
        Employee employee = employeeOptional.get();

        employee.setEmpName(newEmployeeRequest.empName());
        employee.setEmpEmail(newEmployeeRequest.empEmail());
        employee.setEmpAge(newEmployeeRequest.empAge());

        employeeRepo.save(employee);
    }
}
