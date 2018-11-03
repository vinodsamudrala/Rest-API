package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	public TopicService() {
		super();
		System.out.println("New Instance created for TopicService");
	}

	private List<Topic> topics =new  ArrayList<>(Arrays.asList( 
			new Topic("java", "Java Core", "Full Core Java Concepts"),
			new Topic("Spring","Spring frame Work","Full Spring App"),
			new Topic("REST", "Spring RestAPI", "Spring Boot Rest API")
			)) ;
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopics(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void addTopicList(List<Topic> topicsList) {
		topics.addAll(topicsList);
	}

}
