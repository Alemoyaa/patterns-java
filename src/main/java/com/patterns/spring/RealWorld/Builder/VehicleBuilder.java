package com.patterns.spring.RealWorld.Builder;

import com.patterns.spring.RealWorld.Vehicles.Vehicle;

public abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void createNewVehicle(String vehicleType) {
        vehicle = new Vehicle(vehicleType);
    }

    public abstract void buildFrame();

    public abstract void buildEngine();

    public abstract void buildWheels();

    public abstract void buildDoors();
}
