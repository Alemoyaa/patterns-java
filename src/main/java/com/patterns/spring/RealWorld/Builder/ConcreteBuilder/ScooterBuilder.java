package com.patterns.spring.RealWorld.Builder.ConcreteBuilder;

import com.patterns.spring.RealWorld.Builder.VehicleBuilder;
import com.patterns.spring.RealWorld.Vehicles.Vehicle;

public class ScooterBuilder extends VehicleBuilder {
    
    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "Scooter Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "50 cc");
    }

    @Override
    public void buildWheels() {
        vehicle.setPart("wheels", "2");
    }

    @Override
    public void buildDoors() {
        vehicle.setPart("doors", "0");
    }
    
}
