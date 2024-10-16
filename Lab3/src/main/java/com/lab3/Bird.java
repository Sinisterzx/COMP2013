package com.lab3;

public class Bird extends Animals {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("worms");
    }

    @Override
    public void Maintain() {
        System.out.println("Flights to maintain Bird");
    }
}
