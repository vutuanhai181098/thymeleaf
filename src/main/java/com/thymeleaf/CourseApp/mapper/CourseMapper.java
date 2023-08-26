package com.thymeleaf.CourseApp.mapper;

import com.thymeleaf.CourseApp.dto.CourseDto;
import com.thymeleaf.CourseApp.dto.UserDto;
import com.thymeleaf.CourseApp.entites.Course;

public interface CourseMapper {
    CourseDto mapToDto(Course course, UserDto userDto);
}
