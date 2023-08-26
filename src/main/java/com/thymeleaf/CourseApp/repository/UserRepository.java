package com.thymeleaf.CourseApp.repository;

import com.thymeleaf.CourseApp.entites.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUser();

    Optional<User> getUserById(Integer id);
}
