package com.lab3;

import java.util.ArrayList;

public class Compound {
    private ArrayList<Animals> many_animals = new ArrayList<>();

    public Compound (int num_animals, Animals animal){
        for (int i = 0; i < num_animals; i++) {

            many_animals.add(animal);


        }
    }

}
