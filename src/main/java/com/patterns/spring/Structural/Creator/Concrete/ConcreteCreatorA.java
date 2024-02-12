package com.patterns.spring.Structural.Creator.Concrete;

import com.patterns.spring.Structural.Creator.Creator;
import com.patterns.spring.Structural.Product.Product;
import com.patterns.spring.Structural.Product.Concrete.ConcreteProductA;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
    
}
