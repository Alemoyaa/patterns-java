package com.patterns.spring.structural.Factory.Concrete;

import com.patterns.spring.structural.Factory.AbstractFactory;
import com.patterns.spring.structural.Product.AbstractProductA;
import com.patterns.spring.structural.Product.AbstractProductB;
import com.patterns.spring.structural.Product.ProductA.ProductA1;
import com.patterns.spring.structural.Product.ProductB.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
    
}
