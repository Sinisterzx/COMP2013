package com.lab3;

public abstract class Animals implements Maintainable{
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void eat();

    public void enjoy(){
        System.out.println(this.getClass().getSimpleName() + " enjoys life as an animal.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
