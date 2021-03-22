package com.privalia.presentation.annotationsst;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Student student = (Student) context.getBean("student");
		student.setName("aaa");
		System.out.println(student.getName());
		Student studentconst = (Student) context.getBean("studentConst");
		studentconst.setName("aaa");
		System.out.println(studentconst.getName());
		context.close();
	}

}
