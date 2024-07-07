package com.spring.Stduy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/hello")
    public String hello(){
        return "hi";
    }

    @RequestMapping("/topics")
    public List<Topic> findAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic findTopicsById(@PathVariable int id){
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopics(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/topics/{id}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable int id){
        return topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopics(@PathVariable int id){
        topicService.deleteTopic(id);
    }

}
