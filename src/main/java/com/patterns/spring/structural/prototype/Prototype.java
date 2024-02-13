package com.patterns.spring.structural.prototype;

public abstract class Prototype {
    private String _id;

    public Prototype(String id) {
        this._id = id;
    }

    public String getId() {
        return _id;
    }

    public abstract Prototype clone();
}
