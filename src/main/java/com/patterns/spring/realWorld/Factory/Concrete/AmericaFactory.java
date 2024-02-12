package com.patterns.spring.realWorld.Factory.Concrete;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;
import com.patterns.spring.realWorld.Animals.America.Bison;
import com.patterns.spring.realWorld.Animals.America.Wolf;
import com.patterns.spring.realWorld.Factory.ContinentFactory;

public class AmericaFactory extends ContinentFactory {

    @Override
    public Herbivore createHerbivore() {
        return new Bison();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Wolf();
    }

}
