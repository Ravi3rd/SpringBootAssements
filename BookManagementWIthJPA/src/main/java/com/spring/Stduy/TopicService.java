package com.spring.Stduy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>();

    public List<Topic> getAllTopics(){
        return topicRepository.findAll(); //.forEach(topics::add);
    }

    public Topic getTopicById(int id){
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public Topic updateTopic(Topic newTopic, int id) {
        return topicRepository.findById(id).map(topic->{
            topic.setId(newTopic.getId());
            topic.setName(newTopic.getName());
            topic.setAuthor(newTopic.getAuthor());
            return topicRepository.save(newTopic);
        })
                .orElseThrow(()->new NoSuchElementException("Topic with id"+id+"not found"));
    }

    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
}