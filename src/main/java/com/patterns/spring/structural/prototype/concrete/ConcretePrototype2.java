package com.patterns.spring.structural.prototype.concrete;

import com.patterns.spring.structural.prototype.Prototype;

public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.getId());
    }
}
