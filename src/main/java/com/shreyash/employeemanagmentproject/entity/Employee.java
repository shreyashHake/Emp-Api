package com.shreyash.employeemanagmentproject.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity()
@Table(name = "employee")
public class Employee {
    @Id
    @SequenceGenerator(
            name = "empId",
            sequenceName = "empId"
    )
    @GeneratedValue(
            generator = "empId",
            strategy = GenerationType.SEQUENCE
    )
    private Integer empId;
    private String empName;
    private String empEmail;
    private Integer empAge;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String empEmail, Integer empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empAge = empAge;
    }

    public Employee(String empName, String empEmail, Integer empAge) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empAge = empAge;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(empEmail, employee.empEmail) && Objects.equals(empAge, employee.empAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empEmail, empAge);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", age=" + empAge +
                '}';
    }
}
