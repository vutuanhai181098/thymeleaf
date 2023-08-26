package com.thymeleaf.CourseApp.service;

import com.thymeleaf.CourseApp.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getAllCourse(String type, String name, String topic);

    CourseDto getCourseById(Integer id);
}
