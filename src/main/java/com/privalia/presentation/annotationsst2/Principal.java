package com.privalia.presentation.annotationsst2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.presentation.annotations2.HelloWorld;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.presentation.annotationsst2");
		annotationContext.refresh(); //se carga las anotaciones
		
		Student st = annotationContext.getBean(Student.class);
		st.setName("Mortadelo");
		System.out.println(st.getName());
		
		Student st1= annotationContext.getBean(Student.class);
		System.out.println(st1);
		annotationContext.close();
	}

}
