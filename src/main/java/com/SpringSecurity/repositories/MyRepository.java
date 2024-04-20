package com.SpringSecurity.repositories;

import com.SpringSecurity.entities.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyRepository extends JpaRepository<MyUser,Long> {
    Optional<MyUser> findByUsername(String username);
}
