package com.lab3;

public class Bear extends Animals{


    public Bear(String name) {
        super(name);
    }

    @Override
    public short eat() {
        System.out.println("Fish");
        return 0;
    }

    @Override
    public void Maintain() {
        System.out.println("Walks to maintain Bear");
    }
}
