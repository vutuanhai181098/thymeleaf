package com.thymeleaf.CourseApp.controller;

import com.thymeleaf.CourseApp.dto.CourseDto;
import com.thymeleaf.CourseApp.service.CourseService;
import com.thymeleaf.CourseApp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TopicService topicService;

    @GetMapping("")
    public String getCoursePage(Model model){
        List<CourseDto> courseDtoList = courseService.getAllCourse(null, null, null);
        List<String> topicList = topicService.getAllTopic();
        model.addAttribute("courseList", courseDtoList);
        model.addAttribute("topicList", topicList);
        return "course-list";
    }

    @GetMapping("/online")
    public String getCourseOnlinePage(Model model){
        List<CourseDto> courseDtoList = courseService.getAllCourse("online", null, null);
        List<String> topicList = topicService.getAllTopic();
        model.addAttribute("courseList", courseDtoList);
        model.addAttribute("topicList", topicList);
        return "course-online-list";
    }

    @GetMapping("/onlab")
    public String getCourseOnlabPage(Model model){
        List<CourseDto> courseDtoList = courseService.getAllCourse("onlab", null, null);
        List<String> topicList = topicService.getAllTopic();
        model.addAttribute("courseList", courseDtoList);
        model.addAttribute("topicList", topicList);
        return "course-onlab-list";
    }

    @GetMapping("/{id}")
    public String getCourseById(@PathVariable Integer id, Model model){
        CourseDto courseDto = courseService.getCourseById(id);
        model.addAttribute("course", courseDto);
        return "detail";
    }
}
