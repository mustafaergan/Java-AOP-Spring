package com.mustafaergan.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public void hello() {
		System.out.println("Hello World With AOP");
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public List<SumValue> sumList(int a, int b) {
		List<SumValue> list = new ArrayList<>();
		list.add(new SumValue(5, 10));
		list.add(new SumValue(15, 10));
		return list;
	}

	public SumValue sumObject() {
		SumValue as = new SumValue(5, 10);
		return as;
	}

}
