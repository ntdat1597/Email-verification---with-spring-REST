package com.example.springbootemailverificationmysql.repository;

import com.example.springbootemailverificationmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByEmail(String email);
}
