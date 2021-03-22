package com.privalia.presentation.annotationsst3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext appcontext = new AnnotationConfigApplicationContext("spring-config.xml");
		Student student = (Student) appcontext.getBean("student");
		student.setName("aaa");
		System.out.println(student.getName());
		Student studentconst = (Student) appcontext.getBean("studentConst");
		studentconst.setName("aaa");
		System.out.println(studentconst.getName());
		appcontext.close();
	}

}
