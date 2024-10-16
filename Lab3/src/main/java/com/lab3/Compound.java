package com.lab3;

import java.util.ArrayList;

public class Compound {
    private ArrayList<Animals> many_animals;

    public Compound (int num_animals){
        for (int i = 0; i < num_animals; i++) {
            many_animals.add(many_animals.get(i));
        }
    }

}
