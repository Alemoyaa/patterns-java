package com.patterns.spring.RealWorld;

import com.patterns.spring.RealWorld.Builder.VehicleBuilder;

public class Shop {

    public void Construct(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.buildFrame();
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildDoors();
    }
}
