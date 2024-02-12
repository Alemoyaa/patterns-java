package com.patterns.spring.Structural.Creator.Concrete;

import com.patterns.spring.Structural.Creator.Creator;
import com.patterns.spring.Structural.Product.Product;
import com.patterns.spring.Structural.Product.Concrete.ConcreteProductB;

public class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
    
}
