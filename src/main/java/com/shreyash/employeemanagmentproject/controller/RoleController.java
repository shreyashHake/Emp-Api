package com.shreyash.employeemanagmentproject.controller;

import com.shreyash.employeemanagmentproject.entity.Role;
import com.shreyash.employeemanagmentproject.records.NewRoleRequest;
import com.shreyash.employeemanagmentproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/get")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping("/post")
    public String addRole(@RequestBody NewRoleRequest newRoleRequest){
        roleService.addRole(newRoleRequest);
        return "Role added";
    }

    @PutMapping("/update/{roleId}")
    public String updateRole(@PathVariable Integer roleId, @RequestBody NewRoleRequest newRoleRequest) {
        roleService.updateRole(roleId, newRoleRequest);
        return "Role updated";
    }

    @DeleteMapping("/delete/{roleId}")
    public String deleteRole(@PathVariable Integer roleId) {
        roleService.deleteRole(roleId);
        return "Role Deleted";
    }

}
