package com.patterns.spring.structural;

import com.patterns.spring.structural.Factory.AbstractFactory;
import com.patterns.spring.structural.Product.AbstractProductA;
import com.patterns.spring.structural.Product.AbstractProductB;

/*
 * ClientStructural class
 * This class is the client of the AbstractFactory and AbstractProduct classes.
 * They are relationals classes, but the client class is the one that uses the
 * AbstractFactory and AbstractProduct classes to create and use the products.
 */
public class ClientStructural {
    private AbstractProductA _AbstractProductA;
    private AbstractProductB _AbstractProductB;

    public ClientStructural(AbstractFactory factory) {
        _AbstractProductA = factory.createProductA();
        _AbstractProductB = factory.createProductB();
    }

    public void run() {
        _AbstractProductB.interact(_AbstractProductA);
    }
}
