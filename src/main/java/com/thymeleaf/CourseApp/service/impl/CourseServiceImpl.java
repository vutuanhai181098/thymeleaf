package com.thymeleaf.CourseApp.service.impl;

import com.thymeleaf.CourseApp.dto.CourseDto;
import com.thymeleaf.CourseApp.entites.Course;
import com.thymeleaf.CourseApp.entites.User;
import com.thymeleaf.CourseApp.exception.ResourceNotFoundException;
import com.thymeleaf.CourseApp.mapper.CourseMapper;
import com.thymeleaf.CourseApp.mapper.UserMapper;
import com.thymeleaf.CourseApp.repository.CourseRepository;
import com.thymeleaf.CourseApp.repository.UserRepository;
import com.thymeleaf.CourseApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<CourseDto> getAllCourse(String type, String name, String topic) {
        List<Course> courseList = courseRepository.getAllCourse()
                .stream().filter(c -> (type == null || c.getType().toLowerCase().contains(type.toLowerCase())) &&
                (name == null || c.getName().toLowerCase().contains(name.toLowerCase())) &&
                (topic == null || c.getTopics().contains(topic))).collect(Collectors.toList());
        return courseList.stream().map(course -> {
            User user = userRepository.getUserById(course.getUserId())
                    .orElseThrow(() -> {
                        throw new ResourceNotFoundException("Not found user");
                    });
            return courseMapper.mapToDto(course, userMapper.mapToDto(user));
        }).collect(Collectors.toList());
    }

    @Override
    public CourseDto getCourseById(Integer id) {
        Course course = courseRepository.getCourseById(id);
        User user = userRepository.getUserById(course.getUserId())
                .orElseThrow(() -> {
                    throw new ResourceNotFoundException("Not found user");
                });
        return courseMapper.mapToDto(course, userMapper.mapToDto(user));
    }
}
