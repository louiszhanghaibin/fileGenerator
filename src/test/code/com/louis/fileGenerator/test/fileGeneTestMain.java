package com.louis.fileGenerator.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.louis.fileGenerator.services.BasicService;

public class fileGeneTestMain {
	public static void main(String[] args) throws Exception {
		Map<String, String> map = new HashMap<>();

		List<BasicService> basicServices = new LinkedList<>();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

		BasicService mgFileGeneService = (BasicService) context.getBean("dMGZXJFFileGeneService");
		basicServices.add(mgFileGeneService);

		map.put("settleDate", "20160112");
		map.put("province", "471");
		map.put("busiLine", "0064");
		map.put("dataSum", "1000");
		map.put("fileDataSum", "1000");
		map.put("fileSum", "auto");

		for (BasicService basicService : basicServices) {
			basicService.doService(map);
		}
	}
}
