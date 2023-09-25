package com.example.APIGuardian.service;

import javax.management.relation.RoleNotFoundException;

import com.example.APIGuardian.model.User;

public interface UserService {
    User registerUser(String username, String password) throws RoleNotFoundException, Exception;
    User authenticateUser(String username, String password);
    
}