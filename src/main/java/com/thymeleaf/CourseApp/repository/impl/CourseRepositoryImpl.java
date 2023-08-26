package com.thymeleaf.CourseApp.repository.impl;

import com.thymeleaf.CourseApp.database.CourseDB;
import com.thymeleaf.CourseApp.entites.Course;
import com.thymeleaf.CourseApp.exception.ResourceNotFoundException;
import com.thymeleaf.CourseApp.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public List<Course> getAllCourse() {
        return CourseDB.courseList;
    }

    @Override
    public Course getCourseById(Integer id) {
        return CourseDB.courseList.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst().orElseThrow(() -> {
                    throw new ResourceNotFoundException("Not found Course");
                });
    }
}
