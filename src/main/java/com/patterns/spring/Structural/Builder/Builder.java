package com.patterns.spring.Structural.Builder;

import com.patterns.spring.Structural.Product.Product;

public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
