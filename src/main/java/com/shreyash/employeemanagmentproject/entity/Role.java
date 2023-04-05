package com.shreyash.employeemanagmentproject.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @SequenceGenerator(
            name = "roleId",
            sequenceName = "roleId"
    )
    @GeneratedValue(
            generator = "roleId",
            strategy = GenerationType.SEQUENCE
    )
    private Integer roleId;
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public Role(Integer roleId, String role) {
        this.roleId = roleId;
        this.role = role;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role1 = (Role) o;
        return Objects.equals(roleId, role1.roleId) && Objects.equals(role, role1.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, role);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", role='" + role + '\'' +
                '}';
    }
}
