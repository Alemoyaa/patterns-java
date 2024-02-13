package com.patterns.spring.realworld.prototype.concrete;

import com.patterns.spring.realworld.prototype.ColorPrototype;

import java.util.HashMap;

public class ColorManager {
    private HashMap<String, ColorPrototype> colors = new HashMap<>();

    public ColorPrototype getColor(String colorName) {
        return colors.get(colorName).clone();
    }

    public void addColor(String name, ColorPrototype color) {
        colors.put(name, color);
    }
}
