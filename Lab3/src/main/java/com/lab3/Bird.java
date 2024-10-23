package com.lab3;

public class Bird extends Animals {

    public Bird(String name) {
        super(name);
    }

    @Override
    public short eat() {
        System.out.println("worms");
        return 0;
    }

    @Override
    public void Maintain() {
        System.out.println("Flights to maintain Bird");
    }
}
