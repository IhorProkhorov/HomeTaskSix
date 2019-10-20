package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

import com.hillel.IhorProkhorov.HomeTaskSix.Interfaces.TypeOfWild;

public abstract class WildAnimal extends Animal implements TypeOfWild {

    private boolean isPredator;

    WildAnimal(int id, int age, double weight, String color, boolean isPredator){
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String voice() {
        if (isAngry()) return super.voice() + "I am a wild animal " + "and I am angry ";
        else return super.voice() + "I am a wild animal ";
    }

}
