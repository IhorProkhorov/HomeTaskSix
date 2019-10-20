package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

import com.hillel.IhorProkhorov.HomeTaskSix.Interfaces.SayingSomething;

public class Animal implements SayingSomething {

    private int id;
    private int age;
    private double weight;
    private String color;

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String voice() {
        return "Hello, ";
    }

}
