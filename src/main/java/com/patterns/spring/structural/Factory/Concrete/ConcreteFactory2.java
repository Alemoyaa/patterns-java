package com.patterns.spring.structural.Factory.Concrete;

import com.patterns.spring.structural.Factory.AbstractFactory;
import com.patterns.spring.structural.Product.ProductA.ProductA2;
import com.patterns.spring.structural.Product.ProductB.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public com.patterns.spring.structural.Product.AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public com.patterns.spring.structural.Product.AbstractProductB createProductB() {
        return new ProductB2();
    }
    
}
