package com.lab3;

public interface Employable{
    public void set_employee_id(int employee_id);
    public int get_employee_id();
    public void set_name(String name);
    public String get_name();
    public void set_salary(double salary);
    public double get_salary();
    public double calulate_bonus();
}
