package com.home_project.oop_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.home_project.oop_project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
