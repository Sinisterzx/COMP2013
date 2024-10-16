package com.lab3;

public class Zookeeper extends Employee{

    public Zookeeper(String name) {
        super(name);
    }

    @Override
    public double calculate_bonus(){
        return (get_salary() * 0.05) + 100;
    }
}
