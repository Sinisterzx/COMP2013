package com.lab3;

public class Fish extends Animals {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Kelp");
    }

    @Override
    public void Maintain() {
        System.out.println("Swims to maintain Bear");
    }
}
