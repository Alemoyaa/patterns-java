package com.patterns.spring.realWorld.Factory.Concrete;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;
import com.patterns.spring.realWorld.Animals.Africa.Lion;
import com.patterns.spring.realWorld.Animals.Africa.Wildebeest;
import com.patterns.spring.realWorld.Factory.ContinentFactory;

public class AfricaFactory extends ContinentFactory {

    @Override
    public Herbivore createHerbivore() {
        return new Wildebeest();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Lion();
    }

}
