package com.shreyash.employeemanagmentproject.service;

import com.shreyash.employeemanagmentproject.entity.Role;
import com.shreyash.employeemanagmentproject.records.NewRoleRequest;
import com.shreyash.employeemanagmentproject.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }

    @Override
    public void addRole(NewRoleRequest newRoleRequest) {
        Role role = new Role(
                newRoleRequest.role()
        );
        roleRepo.save(role);
    }

    @Override
    public void updateRole(Integer roleId, NewRoleRequest newRoleRequest) {
        Optional<Role> optionalRole = roleRepo.findById(roleId);
        Role role = optionalRole.get();

        role.setRole(newRoleRequest.role());

        roleRepo.save(role);
    }

    @Override
    public void deleteRole(Integer roleId) {
        roleRepo.deleteById(roleId);
    }
}
