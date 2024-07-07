package com.spring.Stduy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Ravi",12,"Ravi"),
            new Topic("rakesh",1,"Ravi"),
            new Topic("Ravish",2,"Ravi")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopicById(int id){
        return topics.stream()
                .filter(
                        o->o.getId()==id
                )
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public Topic updateTopic(Topic newTopic, int id) {
        Optional<Topic> updatedTopic = topics.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .map(o -> {
                    o.setAuthor(newTopic.getAuthor());
                    o.setId(newTopic.getId());
                    o.setName(newTopic.getName());
                    return o;
                });

        return updatedTopic.orElse(null);
    }

    public void deleteTopic(int id){
        topics.removeIf(o->o.getId()==id);
    }
}