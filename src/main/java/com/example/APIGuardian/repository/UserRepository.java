package com.example.APIGuardian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIGuardian.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
