package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Fish extends Animal {
    public Fish(int id, int age, double weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String voice() {
        return "....";
    }
}
