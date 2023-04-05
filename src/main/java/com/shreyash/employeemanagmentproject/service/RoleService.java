package com.shreyash.employeemanagmentproject.service;

import com.shreyash.employeemanagmentproject.entity.Role;
import com.shreyash.employeemanagmentproject.records.NewRoleRequest;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void addRole(NewRoleRequest newRoleRequest);

    void updateRole(Integer roleId, NewRoleRequest newRoleRequest);

    void deleteRole(Integer roleId);
}
