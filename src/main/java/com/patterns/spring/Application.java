package com.patterns.spring;

import com.patterns.spring.realworld.Compound;
import com.patterns.spring.realworld.RichCompound;
import com.patterns.spring.structural.Adapter;
import com.patterns.spring.structural.Target;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		testStructural();
		testRealWorld();
	}

	public static void testRealWorld() {
		Compound unknown = new Compound();
		unknown.display();

		Compound water = new RichCompound("Water");
		water.display();

		Compound benzene = new RichCompound("Benzene");
		benzene.display();

		Compound ethanol = new RichCompound("Ethanol");
		ethanol.display();
	}

	public static void testStructural() {
		// Create adapter
		Target target = new Adapter();
		// Call request
		target.request();
	}
}
