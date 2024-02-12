package com.patterns.spring.Structural.Builder.ConcreteBuilder;

import com.patterns.spring.Structural.Builder.Builder;
import com.patterns.spring.Structural.Product.Product;

public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
    
}
