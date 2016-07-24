package com.geekymv.dubbo_cluster_demo_consumer.dubbo_cluster_demo_consumer;

import org.dubbo.cluster.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
		
		DemoService demoService = (DemoService) applicationContext.getBean("demoService");

		String res = demoService.sayhello();
		System.out.println(res);
	}
}
