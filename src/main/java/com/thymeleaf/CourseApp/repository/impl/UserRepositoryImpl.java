package com.thymeleaf.CourseApp.repository.impl;

import com.thymeleaf.CourseApp.database.UserDB;
import com.thymeleaf.CourseApp.entites.User;
import com.thymeleaf.CourseApp.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUser() {
        return UserDB.userList;
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return UserDB.userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
