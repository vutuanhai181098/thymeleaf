package com.thymeleaf.CourseApp.controller;


import com.thymeleaf.CourseApp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("")
    public ResponseEntity<?> getAllTopic(){
        return ResponseEntity.ok(topicService.getAllTopic());
    }
}
