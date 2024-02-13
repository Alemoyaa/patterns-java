package com.patterns.spring;

import com.patterns.spring.structural.prototype.concrete.ConcretePrototype1;
import com.patterns.spring.structural.prototype.concrete.ConcretePrototype2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        testStructural();
	}

    public static void testStructural() {
        ConcretePrototype1 prototype = new ConcretePrototype1("1");
        ConcretePrototype1 clone = (ConcretePrototype1) prototype.clone();
        System.out.println(prototype.equals(clone));
        System.out.println(prototype.getId());
        System.out.println(clone.getId());

        ConcretePrototype2 prototype2 = new ConcretePrototype2("2");
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();
        System.out.println(prototype2 == clone2);
    }
}
