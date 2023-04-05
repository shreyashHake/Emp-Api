package com.shreyash.employeemanagmentproject.service;

import com.shreyash.employeemanagmentproject.entity.Department;
import com.shreyash.employeemanagmentproject.records.NewDepartmentRequest;
import com.shreyash.employeemanagmentproject.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public void addDepartment(NewDepartmentRequest newDepartmentRequest) {
        departmentRepo.save(new Department(
                newDepartmentRequest.depName(),
                newDepartmentRequest.depManager(),
                newDepartmentRequest.numberOfEmp()
        ));
        System.out.println(newDepartmentRequest);
    }

    @Override
    public void updateDepartment(Integer depId, NewDepartmentRequest newDepartmentRequest) {
        Optional<Department> departmentOptional = departmentRepo.findById(depId);
        Department department = departmentOptional.get();

        department.setDepManager(newDepartmentRequest.depManager());
        department.setDepName(newDepartmentRequest.depName());
        department.setNumberOfEmp(newDepartmentRequest.numberOfEmp());

        departmentRepo.save(department);
    }

    @Override
    public void deleteDepartment(Integer depId) {
        departmentRepo.deleteById(depId);
    }
}
