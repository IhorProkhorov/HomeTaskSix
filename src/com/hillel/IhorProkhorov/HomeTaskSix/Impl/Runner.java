package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat(1, 12, 3.5, "white", "BoB", false);
        System.out.println(cat.voice());

        Dog dog = new Dog(2, 22, 4, "black", "Myhtar", true);
        System.out.println(dog.voice());

        Wolf wolf = new Wolf(23, 3, 4, "black", true);
        System.out.println(wolf.voice());

        Lion lion = new Lion(3, 23, 300, "yellow", true);
        System.out.println(lion.voice());

        Giraffe giraffe = new Giraffe(4, 23, 300, "yellow", true);
        System.out.println(giraffe.voice());

        Fish fish = new Fish(6, 1, 2, "red");
        System.out.println(fish.voice());

        Hamster hamster = new Hamster(5, 1, 1, "grey", "Vacya", false);
        System.out.println(hamster.voice());

        GuideDog guideDog = new GuideDog(10, 3, 12, "grey", "Ted", true, false);
        System.out.println(guideDog.voice());

        GuideDog anotherGuideDog = new GuideDog(11, 3, 12, "grey", "Tedy", true, true);
        System.out.println(anotherGuideDog.voice());
    }
}
