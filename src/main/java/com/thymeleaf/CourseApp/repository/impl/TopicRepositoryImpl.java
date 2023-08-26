package com.thymeleaf.CourseApp.repository.impl;

import com.thymeleaf.CourseApp.database.TopicDB;
import com.thymeleaf.CourseApp.repository.TopicRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public class TopicRepositoryImpl implements TopicRepository {
    @Override
    public List<String> getAllTopic() {
        return TopicDB.topicList;
    }
}
