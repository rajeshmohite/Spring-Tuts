package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class Demo {
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
	Employee employee = ctx.getBean("employee", Employee.class);
	employee.perform();
	
	}
}
