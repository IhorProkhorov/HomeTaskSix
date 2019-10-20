package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Giraffe extends WildAnimal {

    public Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public boolean isAngry() {
        return false;
    }
}
