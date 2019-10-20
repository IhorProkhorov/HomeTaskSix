package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Cat extends HomeAnimal {

    public static final String say = "Meow";

    Cat(int id, int age, double weight, String color, String name, boolean isVaccinated){
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + " " + say;
    }
}
