package com.shreyash.employeemanagmentproject.entity;

import jakarta.persistence.*;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.Objects;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @SequenceGenerator(
            name = "depId",
            sequenceName = "depId"
    )
    @GeneratedValue(
            generator = "depId",
            strategy = GenerationType.SEQUENCE
    )
    private Integer depId;

    private String depName;
    private String depManager;
    private Integer numberOfEmp;

    public Department() {
    }

    public Department(String depName, String depManager, Integer numberOfEmp) {
        this.depName = depName;
        this.depManager = depManager;
        this.numberOfEmp = numberOfEmp;
    }

    public Department(Integer depId, String depName, String depManager, Integer numberOfEmp) {
        this.depId = depId;
        this.depName = depName;
        this.depManager = depManager;
        this.numberOfEmp = numberOfEmp;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepManager() {
        return depManager;
    }

    public void setDepManager(String depManager) {
        this.depManager = depManager;
    }

    public Integer getNumberOfEmp() {
        return numberOfEmp;
    }

    public void setNumberOfEmp(Integer numberOfEmp) {
        this.numberOfEmp = numberOfEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(depId, that.depId) && Objects.equals(depName, that.depName) && Objects.equals(depManager, that.depManager) && Objects.equals(numberOfEmp, that.numberOfEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depId, depName, depManager, numberOfEmp);
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depManager=" + depManager +
                ", numberOfEmp=" + numberOfEmp +
                '}';
    }
}
