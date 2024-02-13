package com.patterns.spring.realworld.prototype.concrete;

import com.patterns.spring.realworld.prototype.ColorPrototype;

public class Color extends ColorPrototype {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(Color color) {
        this.red = color.red;
        this.green = color.green;
        this.blue = color.blue;
    }

    @Override
    public ColorPrototype clone() {
        return new Color(this);
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
