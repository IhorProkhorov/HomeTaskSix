package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Lion extends WildAnimal {

    public Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public boolean isAngry() {
        return true;
    }
}
