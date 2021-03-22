package com.privalia.presentation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.presentation.annotations2.HelloWorld;
import com.privalia.presentation.annotationsst2.Student;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.presentation.annotationsst2");
		annotationContext.refresh(); //se carga las anotaciones
		
		Student student = annotationContext.getBean(Student.class);
		student.setName("aaaa");
		System.out.println(student.getName());
		
		Student student2 = annotationContext.getBean(Student.class);
		student2.setName("aaaa");
		System.out.println(student2.getName());
		annotationContext.close();
	}

}
