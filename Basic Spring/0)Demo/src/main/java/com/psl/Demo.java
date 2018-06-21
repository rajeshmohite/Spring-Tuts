package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.A;

public class Demo {
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	A a = (A) ctx.getBean("a");
	}
}
