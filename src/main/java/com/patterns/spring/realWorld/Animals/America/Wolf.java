package com.patterns.spring.realWorld.Animals.America;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;

public class Wolf extends Carnivore {

    @Override
    public void eat(Herbivore e) {
        System.out.println(this.getClass().getSimpleName() + " eats " + e.getClass().getSimpleName());
    }
    
}
