package com.example.APIGuardian.service;

import java.util.Optional;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.APIGuardian.model.Role;
import com.example.APIGuardian.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<Role> findRoleByName(String name) throws RoleNotFoundException {
        Optional<Role> role = roleRepository.findByName(name);

        if (role.isPresent()) {
            return Optional.ofNullable(role.get());
        } else {
            throw new RoleNotFoundException("Role not found: " + name);
        }
    }
}

