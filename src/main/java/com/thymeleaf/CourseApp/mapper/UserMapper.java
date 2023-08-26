package com.thymeleaf.CourseApp.mapper;

import com.thymeleaf.CourseApp.dto.UserDto;
import com.thymeleaf.CourseApp.entites.User;

public interface UserMapper {
    UserDto mapToDto(User user);
}
