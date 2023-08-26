package com.thymeleaf.CourseApp.mapper.impl;

import com.thymeleaf.CourseApp.dto.CourseDto;
import com.thymeleaf.CourseApp.dto.UserDto;
import com.thymeleaf.CourseApp.entites.Course;
import com.thymeleaf.CourseApp.mapper.CourseMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseMapperImpl implements CourseMapper {
    @Override
    public CourseDto mapToDto(Course course, UserDto userDto) {
        return CourseDto.builder()
                .id(course.getId())
                .name(course.getName())
                .type(course.getType())
                .description(course.getDescription())
                .topics(course.getTopics())
                .thumbnail(course.getThumbnail())
                .userDto(userDto)
                .build();
    }
}
