package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class HomeAnimal extends Animal{

    private String name;
    private boolean isVaccinated;

    public HomeAnimal(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String voice() {
        return super.voice() + "my name is " + name + ".";
    }
}
