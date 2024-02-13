package com.patterns.spring.realworld;

/*
*   Adaptee (ChemicalDatabank) - the class that needs adapting
* */
public class ChemicalDatabank {

    public float GetCriticalPoint(String compound, String point){
        String upperCompound = compound.toLowerCase();
        if (point.equals("M")){
            if (upperCompound.equals("water")) return 0.0f;
            if (upperCompound.equals("benzene")) return 5.5f;
            if (upperCompound.equals("ethanol")) return -114.1f;
            return 0f;
        }
        else {
            if (upperCompound.equals("water")) return 100.0f;
            if (upperCompound.equals("benzene")) return 80.1f;
            if (upperCompound.equals("ethanol")) return 78.3f;
            return 0f;
        }
    }

    public String GetMolecularStructure(String compound){
        String upperCompound = compound.toLowerCase();
        if (upperCompound.equals("water")) return "H20";
        if (upperCompound.equals("benzene")) return "C6H6";
        if (upperCompound.equals("ethanol")) return "C2H5OH";
        return "";
    }

    public double GetMolecularWeight(String compound){
        String upperCompound = compound.toLowerCase();
        if (upperCompound.equals("water")) return 18.015;
        if (upperCompound.equals("benzene")) return 78.1134;
        if (upperCompound.equals("ethanol")) return 46.0688;
        return 0d;
    }

}
