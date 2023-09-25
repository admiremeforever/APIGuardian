package com.example.APIGuardian.service;

import java.util.Optional;

import javax.management.relation.RoleNotFoundException;

import com.example.APIGuardian.model.Role;

public interface RoleService {
	Optional<Role> findRoleByName(String name) throws RoleNotFoundException;
}
