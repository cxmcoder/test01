package com.hqyj.consumer.modules.test.ov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConfig {
	@Autowired
	private ApplicationConfigTestBean configTestbean;
	@Value("${com.hqyj.name}")
	private String name;
	@Value("${com.hqyj.age}")
	private String age;
	@Value("${com.hqyj.description}")
	private String description;
	@Value("${com.hqyj.random}")
	private String random;
	
	@RequestMapping("/test/config")
	@ResponseBody
	public String getConfig() {
		StringBuffer sb=new StringBuffer();
		sb.append(name).append("----")
			.append(age).append("----")
			.append(description).append("-----")
			.append(random).append("</br>");
		sb.append(configTestbean.getName()).append("----")
		.append(configTestbean.getAge()).append("----")
		.append(configTestbean.getDescription()).append("-----")
		.append(configTestbean.getRandom()).append("</br>");
		return sb.toString();
		
		
	}
}
