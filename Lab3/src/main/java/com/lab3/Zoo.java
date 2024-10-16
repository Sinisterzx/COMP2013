package com.lab3;

import java.util.ArrayList;

public class Zoo {

    private String location;
    private int compounds;

    private static int no_zoos = 0;

    private ArrayList<Compound> many_compounds = new ArrayList<>();

    public Zoo(String location, Integer compounds){
        this.location = location;
        this.compounds = compounds;

        for (int i = 0 ; i < compounds ; i++){

            many_compounds.add(new Compound(i, new Bear("Bruce")));
            many_compounds.add(new Compound(i, new Fish("Frankton")));
            many_compounds.add(new Compound(i, new Bird("Brinda")));
        }

        Zoo.no_zoos++;


    }

    public Zoo(){
        this.location = "unknown";
        this.compounds = 30;
        no_zoos++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void BuildNewCompound(){
        this.compounds++;
    }

    String printInfo(){
        return "location: " + this.location + ", compounds: " + this.compounds;
    }

    static int getNoZoos() {
        return no_zoos;
    }









}
