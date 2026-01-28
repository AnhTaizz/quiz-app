package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.enums.Role;
import com.app.quiz_app_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findByRole(Role role);

    Boolean existsByEmail(String email);

}
