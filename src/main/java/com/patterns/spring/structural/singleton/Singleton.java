package com.patterns.spring.structural.singleton;

public class Singleton {
    private static Singleton instance;

    protected Singleton() {
    }

    public static Singleton getInstance() {
        // Note: This is not thread safe
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
