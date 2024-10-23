package com.lab3;

public class Fish extends Animals {
    public Fish(String name) {
        super(name);
    }

    @Override
    public short eat() {
        System.out.println("Kelp");
        return 0;
    }

    @Override
    public void Maintain() {
        System.out.println("Swims to maintain Bear");
    }
}
