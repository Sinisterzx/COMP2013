package com.lab3;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {

    private String location;
    private int compounds;
    private int id = 0;

    private static int no_zoos = 0;

    private ArrayList<Compound> many_compounds = new ArrayList<>();

    public Zoo(String location, Integer compounds){
        this.location = location;
        this.compounds = compounds;
        Random rand = new Random();
        this.id = rand.nextInt(100000000);

        for (int i = 0 ; i < compounds ; i++){
            many_compounds.add(new Compound(i, new Bear("Bruce")));
        }

        Zoo.no_zoos++;


    }

    public Zoo(){
        Random rand = new Random();
        this.id = rand.nextInt(100000000);
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

    public int get_id(){
        return this.id;
    }

    public int get_num_compounds(){return compounds;}









}
