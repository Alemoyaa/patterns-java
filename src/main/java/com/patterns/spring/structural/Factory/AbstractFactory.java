package com.patterns.spring.structural.Factory;

import com.patterns.spring.structural.Product.AbstractProductA;
import com.patterns.spring.structural.Product.AbstractProductB;

/*
 * AbstractFactory
 * This class the fuction is declarate an interface for operations that create abstract products.
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
