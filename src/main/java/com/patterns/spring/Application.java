package com.patterns.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.spring.RealWorld.Shop;
import com.patterns.spring.RealWorld.Builder.VehicleBuilder;
import com.patterns.spring.RealWorld.Builder.ConcreteBuilder.CarBuilder;
import com.patterns.spring.RealWorld.Builder.ConcreteBuilder.MotorcycleBuilder;
import com.patterns.spring.RealWorld.Builder.ConcreteBuilder.ScooterBuilder;
import com.patterns.spring.RealWorld.Vehicles.Vehicle;
import com.patterns.spring.Structural.Director;
import com.patterns.spring.Structural.Builder.ConcreteBuilder.ConcreteBuilder1;
import com.patterns.spring.Structural.Builder.ConcreteBuilder.ConcreteBuilder2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// testStructural();
		testRealWorld();
	}

	public static void testRealWorld() {
        Shop shop = new Shop();
        VehicleBuilder builder;
        
        // Creating a motorcycle
        builder = new MotorcycleBuilder();
        shop.Construct(builder);
        Vehicle motorcycle = builder.getVehicle();
        System.out.println(motorcycle);

        // Creating a car
        builder = new CarBuilder();
        shop.Construct(builder);
        Vehicle car = builder.getVehicle();
        System.out.println(car);

        // Creating a scooter
        builder = new ScooterBuilder();
        shop.Construct(builder);
        Vehicle scooter = builder.getVehicle();
        System.out.println(scooter);
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
