package com.mustafaergan.aop;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring-Conf.xml");
		MyService bean = (MyService) context.getBean("myService");
		bean.hello();
		int sum = bean.sum(5, 10);
		System.out.println("APP SUM:"+sum);
		bean.sumObject();
		List<SumValue>  list = bean.sumList(5, 10);
	}

}
