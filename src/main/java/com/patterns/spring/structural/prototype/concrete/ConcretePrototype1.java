package com.patterns.spring.structural.prototype.concrete;

import com.patterns.spring.structural.prototype.Prototype;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.getId());
    }
}
