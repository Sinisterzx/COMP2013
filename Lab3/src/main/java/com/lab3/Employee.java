package com.lab3;

public abstract class Employee implements Employable{
    private int id;
    private String name;
    private double salary;

    public Employee(String name){
        this.name = name;
    }


    public void set_employee_id(int employee_id){
        this.id = employee_id;
    }
    public int get_employee_id(){
        return this.id;
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_salary(double salary){
        this.salary = salary;
    }
    public double get_salary(){
        return this.salary;
    }
    public double calulate_bonus(){
        return this.salary / 12 ;
    }

    public abstract double calculate_bonus();

}
