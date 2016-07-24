package org.dubbo.cluster.demo.provider;

import org.dubbo.cluster.demo.api.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayhello() {
		System.out.println("hello geekymv");
		return "say hello";
	}
}
