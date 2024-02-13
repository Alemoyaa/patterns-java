package com.patterns.spring.realworld;

/*
*   The target of the adapter
* */
public class Compound {
    protected float _boilingPoint;
    protected float _meltingPoint;
    protected double _molecularWeight;
    protected String _molecularFormula;

    public void display() {
        System.out.println("\nCompound: Unknown ------- ");
    }
}
