package org.dubbo.cluster.demo.provider;



public class AppTest{
	
	public static void main(String[] args) throws Exception {
		// 自动加载META-INF/spring目录下的所有Spring配置
		com.alibaba.dubbo.container.Main.main(args);
	
//		ClassPathXmlApplicationContext applicationContext = 
//				new ClassPathXmlApplicationContext("spring/META-INF/dubbo-provider.xml");
//		
//		applicationContext.start();
//		System.in.read();
	}

}