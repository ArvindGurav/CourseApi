package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/hiTopics")
	public String getHiTopics() {
		return "All Topics";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getListTopics(){
		return Arrays.asList(new Topic("1","Arvind","Developer"),
				new Topic("2","Kamla","Developer"),
				new Topic("3","Gautam","Developer"),
				new Topic("4","Shashank","Lambu")				
				);
	}
	
}
