package com.thymeleaf.CourseApp.mapper.impl;

import com.thymeleaf.CourseApp.dto.UserDto;
import com.thymeleaf.CourseApp.entites.User;
import com.thymeleaf.CourseApp.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto mapToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .avatar(user.getAvatar())
                .build();
    }
}
