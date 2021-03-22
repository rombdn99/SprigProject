package com.privalia.presentation.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.presentation.annotation2");
		annotationContext.refresh(); //se carga las anotaciones
		
		HelloWorld helloWorld = annotationContext.getBean(HelloWorld.class);
		System.out.println(helloWorld.getHello());
		
		HelloWorld helloWorld1= (HelloWorld) annotationContext.getBean(HelloWorld.class);
		System.out.println(helloWorld1);
		annotationContext.close();
	}

}
