package com.lab3;

public class Admin extends Employee{

    public Admin(String Name){
        super(Name);
    }

    @Override
    public double calculate_bonus(){
        return (get_salary() * 0.05)+100;
    }
}
