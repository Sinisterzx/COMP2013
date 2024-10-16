package com.lab3;

public class Bear extends Animals{


    public Bear(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void Maintain() {
        System.out.println("Walks to maintain Bear");
    }
}
