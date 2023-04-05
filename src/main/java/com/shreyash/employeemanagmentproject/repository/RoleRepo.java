package com.shreyash.employeemanagmentproject.repository;

import com.shreyash.employeemanagmentproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, Integer> {
}
