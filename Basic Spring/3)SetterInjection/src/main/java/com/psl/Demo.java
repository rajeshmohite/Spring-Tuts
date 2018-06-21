package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class Demo {
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
	Employee employee1 = ctx.getBean("employee1", Employee.class);
	employee1.perform();
	
	Employee employee2 = ctx.getBean("employee2", Employee.class);
	employee2.perform();

	}
}
