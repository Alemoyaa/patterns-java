package com.patterns.spring.RealWorld.Builder.ConcreteBuilder;

import com.patterns.spring.RealWorld.Builder.VehicleBuilder;
import com.patterns.spring.RealWorld.Vehicles.Vehicle;

public class MotorcycleBuilder extends VehicleBuilder {

    public MotorcycleBuilder() {
        vehicle = new Vehicle("MotorCycle");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "MotorCycle Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "600 cc");
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
