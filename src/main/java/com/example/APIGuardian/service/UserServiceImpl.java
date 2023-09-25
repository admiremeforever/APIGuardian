package com.example.APIGuardian.service;

import java.util.Collections;
import java.util.Optional;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.APIGuardian.model.Role;
import com.example.APIGuardian.model.User;
import com.example.APIGuardian.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }

        return null; // User authentication failed
    }

    @Override
    public User registerUser(String username, String password) throws Exception {
        if (userRepository.findByUsername(username) != null) {
            throw new Exception("Username already in use");
        }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password));

        // Assign roles based on your application's logic
        Optional<Role> userRole = roleService.findRoleByName("ROLE_USER");
        if (userRole == null) {
            throw new RoleNotFoundException("Role not found");
        }
       
        newUser.setRoles(null);

        userRepository.save(newUser);
        return newUser;
    }
}

