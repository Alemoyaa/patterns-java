package com.patterns.spring.realWorld.Animals.Africa;

import com.patterns.spring.realWorld.Animals.Carnivore;
import com.patterns.spring.realWorld.Animals.Herbivore;

public class Lion extends Carnivore {
    
    @Override
    public void eat(Herbivore e) {
        System.out.println(this.getClass().getSimpleName() + " eats " + e.getClass().getSimpleName());
    }
    
}
