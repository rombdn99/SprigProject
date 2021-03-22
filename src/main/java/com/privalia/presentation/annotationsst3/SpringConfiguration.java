package com.privalia.presentation.annotationsst3;

import org.springframework.context.annotation.Bean;

public class SpringConfiguration {
	@Bean(name="student")
	public Student student() {
		return new Student();
	}
}
