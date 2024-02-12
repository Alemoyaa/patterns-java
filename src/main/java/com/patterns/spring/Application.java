package com.patterns.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.spring.Structural.Director;
import com.patterns.spring.Structural.Builder.ConcreteBuilder.ConcreteBuilder1;
import com.patterns.spring.Structural.Builder.ConcreteBuilder.ConcreteBuilder2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		testStructural();
	}

	public static void testStructural() {
		Director director = new Director();
		ConcreteBuilder1 c1 = new ConcreteBuilder1();

		director.construct(c1);
		c1.getResult().show();

		ConcreteBuilder2 c2 = new ConcreteBuilder2();

		director.construct(c2);
		c2.getResult().show();
	}

}
