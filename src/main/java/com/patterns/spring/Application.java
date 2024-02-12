package com.patterns.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.spring.realWorld.ClientReal;
import com.patterns.spring.realWorld.Factory.Concrete.AfricaFactory;
import com.patterns.spring.realWorld.Factory.Concrete.AmericaFactory;
import com.patterns.spring.structural.ClientStructural;
import com.patterns.spring.structural.Factory.Concrete.ConcreteFactory1;
import com.patterns.spring.structural.Factory.Concrete.ConcreteFactory2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// testForStructuralClient();
		testForRealClient();
	}

	public static void testForRealClient() {
		ClientReal client = new ClientReal(new AfricaFactory());
		client.runFoodChain();
		
		client = new ClientReal(new AmericaFactory());
		client.runFoodChain();
	}

	public static void testForStructuralClient() {
		ConcreteFactory1 factory = new ConcreteFactory1();
		ConcreteFactory2 factory2 = new ConcreteFactory2();

		ClientStructural client = new ClientStructural(factory2);
		client.run();

		client = new ClientStructural(factory);
		client.run();
	}

}
