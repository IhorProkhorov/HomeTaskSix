package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Dog extends HomeAnimal {

    public static final String say = "Woof.";

    Dog(int id, int age, double weight, String color, String name, boolean isVaccinated){
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + " " + say;
    }
}
