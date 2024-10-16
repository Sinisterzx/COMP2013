package com.lab3;

public class ZooApp {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("London", 1);
        Zoo zoo2 = new Zoo("Tokyo", 2);
        Zoo zoo3 = new Zoo("New York", 3);
        Zoo zoo4 = new Zoo("Paris", 4);
        Zoo zoo5 = new Zoo("Beeston", 5);

        Zoo zoos[] = {zoo1, zoo2, zoo3, zoo4, zoo5};

        for (int i = 0 ; i < zoos.length ; i++) {
            System.out.println(zoos[i].printInfo());
            zoos[i].BuildNewCompound();
        }

        ZooCorp corp = new ZooCorp(zoo1);

        for (int i = 1 ; i < zoos.length ; i++) {
            corp.add_zoo(zoos[i]);
        }

        Zookeeper mark = new Zookeeper("mark");
        Admin emily = new Admin("Emily");

        corp.add_employee(mark);
        corp.add_employee(emily);









    }
}
