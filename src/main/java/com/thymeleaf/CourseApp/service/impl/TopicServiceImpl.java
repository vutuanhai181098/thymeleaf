package com.thymeleaf.CourseApp.service.impl;

import com.thymeleaf.CourseApp.repository.TopicRepository;
import com.thymeleaf.CourseApp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;
    @Override
    public List<String> getAllTopic() {
        return topicRepository.getAllTopic();
    }
}
