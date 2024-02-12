package com.patterns.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.spring.Structural.Creator.Creator;
import com.patterns.spring.Structural.Creator.Concrete.ConcreteCreatorA;
import com.patterns.spring.Structural.Product.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

        testStructural();
	}

    public static void testStructural() {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        
        System.out.println(product);
    }
}
