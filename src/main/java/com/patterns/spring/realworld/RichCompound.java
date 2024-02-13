package com.patterns.spring.realworld;

/*
*   The Adapter
* */
public class RichCompound extends Compound {
    private String _chemical;
    private ChemicalDatabank _bank;

    public RichCompound(String chemical) {
        _chemical = chemical;
    }

    public void display() {
        _bank = new ChemicalDatabank();

        _boilingPoint = _bank.GetCriticalPoint(_chemical, "B");
        _meltingPoint = _bank.GetCriticalPoint(_chemical, "M");
        _molecularWeight = _bank.GetMolecularWeight(_chemical);
        _molecularFormula = _bank.GetMolecularStructure(_chemical);

        System.out.println("\nCompound: " + _chemical + " ------- ");
        System.out.println(" Formula: " + _molecularFormula);
        System.out.println(" Weight : " + _molecularWeight);
        System.out.println(" Melting Pt: " + _meltingPoint);
        System.out.println(" Boiling Pt: " + _boilingPoint);
    }
}
