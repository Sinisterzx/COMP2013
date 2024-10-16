package com.lab3;

import java.util.ArrayList;

public class ZooCorp {

    private ArrayList<Zoo> Many_Zoos;
    private ArrayList<Employee> many_employees;

    public ZooCorp(Zoo thezoo){
        Many_Zoos.add(thezoo);
    }

    public void add_zoo(Zoo thezoo){
        Many_Zoos.add(thezoo);
    }

    public void add_employee(Employee theemployee){
        many_employees.add(theemployee);
    }
}
