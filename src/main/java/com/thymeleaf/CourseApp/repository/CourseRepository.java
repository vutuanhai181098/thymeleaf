package com.thymeleaf.CourseApp.repository;

import com.thymeleaf.CourseApp.entites.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getAllCourse();


    Course getCourseById(Integer id);
}
