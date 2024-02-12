package com.patterns.spring.Structural.Product;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\nProduct completed as below :");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
