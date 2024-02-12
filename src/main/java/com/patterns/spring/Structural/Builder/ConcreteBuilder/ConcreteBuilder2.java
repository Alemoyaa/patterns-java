package com.patterns.spring.Structural.Builder.ConcreteBuilder;

import com.patterns.spring.Structural.Builder.Builder;
import com.patterns.spring.Structural.Product.Product;

public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part X");
    }

    @Override
    public void buildPartB() {
        product.add("Part Z");
    }

    @Override
    public Product getResult() {
        return product;
    }
    
}
