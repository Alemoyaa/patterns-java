package com.patterns.spring.structural.Product.ProductB;

import com.patterns.spring.structural.Product.AbstractProductA;
import com.patterns.spring.structural.Product.AbstractProductB;

public class ProductB2 extends AbstractProductB {

    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }
    
}
