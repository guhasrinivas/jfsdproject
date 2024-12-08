package com.klef.jfsd.exam.demo.repositories;

import com.klef.jfsd.exam.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
