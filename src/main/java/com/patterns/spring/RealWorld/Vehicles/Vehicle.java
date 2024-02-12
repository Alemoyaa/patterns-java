package com.patterns.spring.RealWorld.Vehicles;

import java.util.HashMap;

public class Vehicle {
    private String _vehicleType;
    private HashMap<String, String> _parts = new HashMap<String, String>();

    public Vehicle(String vehicleType) {
        _vehicleType = vehicleType;
    }

    public void setPart(String partType, String part) {
        _parts.put(partType, part);
    }

    public String getPart(String partType) {
        return _parts.get(partType);
    }

    public void show() {
        System.out.println("\n---------------------------");
        System.out.println("Vehicle Type: " + _vehicleType);
        System.out.println(" Frame: " + _parts.get("frame"));
        System.out.println(" Engine: " + _parts.get("engine"));
        System.out.println(" #Wheels: " + _parts.get("wheels"));
        System.out.println(" #Doors: " + _parts.get("doors"));
    }

    @Override
    public String toString() {
        return "Vehicle [Type=" + _vehicleType + ", Parts=" + _parts + "]";
    }
}
