package com.patterns.spring.RealWorld.Builder.ConcreteBuilder;

import com.patterns.spring.RealWorld.Builder.VehicleBuilder;
import com.patterns.spring.RealWorld.Vehicles.Vehicle;

public class CarBuilder extends VehicleBuilder {

    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "Car Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "2500 cc");
    }

    @Override
    public void buildWheels() {
        vehicle.setPart("wheels", "4");
    }

    @Override
    public void buildDoors() {
        vehicle.setPart("doors", "4");
    }
    
}
