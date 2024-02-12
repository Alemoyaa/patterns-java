package com.patterns.spring.realWorld.Factory;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;

/*
 * AbstractFactory
 * This class the fuction is declarate an interface for operations that create abstract products.
 */
public abstract class ContinentFactory {
    public abstract Herbivore createHerbivore();
    public abstract Carnivore createCarnivore();
}
