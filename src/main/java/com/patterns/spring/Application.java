package com.patterns.spring;

import com.patterns.spring.realworld.prototype.concrete.Color;
import com.patterns.spring.realworld.prototype.concrete.ColorManager;
import com.patterns.spring.structural.prototype.concrete.ConcretePrototype1;
import com.patterns.spring.structural.prototype.concrete.ConcretePrototype2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//        testStructural();
        testRealWorld();
	}

    public static void testRealWorld() {
        // Create a new color manager
        ColorManager colorManager = new ColorManager();

        // Add colors to the color manager
        colorManager.addColor("red", new Color(255, 0, 0));
        colorManager.addColor("green", new Color(0, 255, 0));
        colorManager.addColor("blue", new Color(0, 0, 255));

        // clone
        Color redClone = (Color) colorManager.getColor("red").clone();
        System.out.println(redClone);
        Color greenClone = (Color) colorManager.getColor("green").clone();
        System.out.println(greenClone);
        Color blueClone = (Color) colorManager.getColor("blue").clone();
        System.out.println(blueClone);

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
