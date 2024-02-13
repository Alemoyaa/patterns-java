package com.patterns.spring;

import com.patterns.spring.RealWorld.Creator.Concrete.Report;
import com.patterns.spring.RealWorld.Creator.Concrete.Resume;
import com.patterns.spring.RealWorld.Creator.Document;
import com.patterns.spring.RealWorld.Product.Page;
import com.patterns.spring.Structural.Creator.Concrete.ConcreteCreatorB;
import com.patterns.spring.Structural.Product.Concrete.ConcreteProductA;
import com.patterns.spring.Structural.Product.Concrete.ConcreteProductB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.spring.Structural.Creator.Creator;
import com.patterns.spring.Structural.Creator.Concrete.ConcreteCreatorA;
import com.patterns.spring.Structural.Product.Product;

import java.util.List;

@SpringBootApplication
public class Application {

    protected static Creator creator;
    protected static Document document;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//        testStructural();
        testRealWorld();
	}

    public static void testRealWorld() {
        document = new Report();
        List<Page> pageList = document.get_pages();
        System.out.println(pageList);

        document = new Resume();
        pageList = document.get_pages();
        System.out.println(pageList);

    }

    public static void testStructural() {
        creator = new ConcreteCreatorA();
        ConcreteProductA productA = (ConcreteProductA) creator.factoryMethod();
        System.out.println(productA);

        creator = new ConcreteCreatorB();
        ConcreteProductB productB = (ConcreteProductB) creator.factoryMethod();
        System.out.println(productB);

        System.out.println("Done");
        System.out.println(productA.getClass());
        System.out.println(productB.getClass());
    }
}
