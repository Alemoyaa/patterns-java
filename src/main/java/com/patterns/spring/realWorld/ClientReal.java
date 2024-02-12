package com.patterns.spring.realWorld;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;
import com.patterns.spring.realWorld.Factory.ContinentFactory;

/*
 * ClientReal class
 */
public class ClientReal {
    private Herbivore _herbivore;
    private Carnivore _carnivore;

    public ClientReal(ContinentFactory factory) {
        _herbivore = factory.createHerbivore();
        _carnivore = factory.createCarnivore();
    }

    public void runFoodChain() {
        _carnivore.eat(_herbivore);
    }
}
