package com.beyzaacikgoz.oop.abstracts;

public class Student extends Person {
    @Override
    public void deneme(String name) {
        super.deneme(name);
    }

    @Override
    public void govdesizMethos(int number) {
        System.out.println("Student:"+number);
    }
}



