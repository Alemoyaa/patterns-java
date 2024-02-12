package com.patterns.spring.Structural;

import com.patterns.spring.Structural.Builder.Builder;

public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}